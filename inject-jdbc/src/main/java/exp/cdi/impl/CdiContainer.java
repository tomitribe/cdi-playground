package exp.cdi.impl;

import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;

import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.spi.ContainerLifecycle;

public class CdiContainer implements java.lang.AutoCloseable {

	private static ContainerLifecycle lifecycle = null;

	public Object getCdiReference(java.lang.Class beanType) {

		Object myBean = null;

		try (PrintStream out = new PrintStream(new FileOutputStream("target/errors.txt"))) {
			System.setErr(out);

			lifecycle = WebBeansContext.currentInstance().getService(ContainerLifecycle.class);
			lifecycle.startApplication(null);

			final BeanManager beanManager = lifecycle.getBeanManager();
			final Bean<?> bean = beanManager.getBeans(beanType).iterator().next();

			myBean = beanManager.getReference(bean, beanType, beanManager.createCreationalContext(bean));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return myBean;

	}

	public void close() throws Exception {
		lifecycle.stopApplication(null);
	}

}
