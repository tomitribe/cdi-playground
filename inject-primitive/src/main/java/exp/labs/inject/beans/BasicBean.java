package exp.labs.inject.beans;

import javax.inject.Inject;

import exp.labs.inject.annotations.Pi;
import exp.labs.inject.annotations.TenDigitPrecision;

public class BasicBean {
	
	@Inject
	public int myValue;
	
	@Inject
	@Pi @TenDigitPrecision
	public double myPi;
	
	
}
