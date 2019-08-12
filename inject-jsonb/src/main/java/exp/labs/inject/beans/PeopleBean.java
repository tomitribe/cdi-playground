package exp.labs.inject.beans;

import java.util.List;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import exp.labs.inject.annotations.JsonSource;
import exp.labs.inject.annotations.Moch;
import exp.labs.inject.annotations.People;

public class PeopleBean {
	
	@Inject
	@People @JsonSource
	private List<Person> people;
	
	public List<Person> listPeople(){
		return people;
	}

}
