


import exp.cdi.impl.CdiContainer;
import exp.labs.inject.beans.*;

public class Main {
	
	public static void main(String[] args) throws Exception{

		try(CdiContainer cdi = new CdiContainer()){
			
			// your code goes here
			
			BasicBean bean = (BasicBean) cdi.getCdiReference(BasicBean.class);
			
			System.out.println("The answer is " + bean.myValue);
			
			System.out.println("The value of Pi = " + bean.myPi);
			
		}

	}

}
