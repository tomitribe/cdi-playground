package exp.labs.inject.producers;

import javax.enterprise.inject.Produces;

import org.apache.johnzon.jsonb.JohnzonBuilder;

import exp.labs.inject.annotations.ApacheJohnzon;

import javax.json.bind.Jsonb;

public class ApacheJohnzonProducer {
	
	@Produces @ApacheJohnzon
	public Jsonb getJsonB() {
		Jsonb jsonb = new JohnzonBuilder().build();
		return jsonb;
	}

}
