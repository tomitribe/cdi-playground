package exp.labs.inject.producers;

import javax.enterprise.inject.Produces;

import exp.labs.inject.annotations.Pi;
import exp.labs.inject.annotations.TwoDigitPrecision;


public class Pi_TwoDigit_Producer {

	@Produces
	@Pi @TwoDigitPrecision
	public double getPi() {
		return 3.14d;
	}

}
