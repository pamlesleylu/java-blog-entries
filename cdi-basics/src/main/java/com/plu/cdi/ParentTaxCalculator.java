package com.plu.cdi;

import javax.enterprise.inject.Alternative;

@Alternative
public class ParentTaxCalculator implements TaxCalculator {

	public double calculate(double salary) {
		return salary * 0.2;
	}

}
