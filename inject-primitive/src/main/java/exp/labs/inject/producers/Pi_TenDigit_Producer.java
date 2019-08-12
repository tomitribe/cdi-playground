package exp.labs.inject.producers;

import javax.enterprise.inject.Produces;

import exp.labs.inject.annotations.Pi;
import exp.labs.inject.annotations.TenDigitPrecision;


public class Pi_TenDigit_Producer{
	
	@Produces
	@Pi @TenDigitPrecision
	public double getPi() {
		return 3.141592653d;
	}

}
