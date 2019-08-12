package exp.labs.inject.producers;

import javax.enterprise.inject.Produces;

public class IntProducer {

	@Produces
	public int i = 42;
}
