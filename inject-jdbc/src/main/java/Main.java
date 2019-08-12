
import exp.cdi.impl.CdiContainer;
import exp.labs.inject.beans.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		try(CdiContainer cdi = new CdiContainer()){
			
			JdbcBean jdbcBean = (JdbcBean) cdi.getCdiReference(JdbcBean.class);
			jdbcBean.run();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
