package com.plu.cdi;

import javax.enterprise.inject.Default;

@Default
public class SingleTaxCalculator implements TaxCalculator {

	public double calculate(double salary) {
		return salary * 0.3;
	}

}
