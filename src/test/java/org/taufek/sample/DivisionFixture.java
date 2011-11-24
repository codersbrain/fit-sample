package org.taufek.sample;

import fit.ColumnFixture;

public class DivisionFixture extends ColumnFixture{

	private Division fixture;
	private Double numerator;
	private Double denominator;
	
	public DivisionFixture(){
		fixture = new Division();
	}
	
	public Double result(){
		fixture.setNumerator(numerator);
		fixture.setDenominator(denominator);
		return fixture.calculate();
	}
}
