import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;


import exp.labs.inject.beans.BasicBean;

public class SeMain {
	
	public static void main(String[] args) throws Exception{

		
		try(SeContainer cdi = SeContainerInitializer.newInstance().initialize()){
			
			// your code goes here
			
			BasicBean bean = (BasicBean) cdi.select(BasicBean.class).get();
			
			System.out.println("The answer is x" + bean.myValue);
			
			System.out.println("The value of Pi = " + bean.myPi);
			
		}

	}


}
