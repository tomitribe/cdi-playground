import java.util.List;

import exp.cdi.impl.CdiContainer;
import exp.labs.inject.beans.*;

public class Main {
	

	public static void main(String[] args) throws Exception{

		try(CdiContainer cdi = new CdiContainer()){
			
			// your code goes here	
			PeopleBean bean = (PeopleBean) cdi.getCdiReference(PeopleBean.class);
			
			List<Person> people = bean.listPeople();
			
			for(Person person : people) {
				System.out.println(person);
			}
		
		}

	}

}
