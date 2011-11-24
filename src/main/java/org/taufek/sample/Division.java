package org.taufek.sample;

public class Division {
 
	private Double numerator;
	private Double denominator;
	
	public void setNumerator(Double numerator) {
		this.numerator = numerator;
	}
	public void setDenominator(Double denominator) {
		this.denominator = denominator;
	}

	public Double calculate() {
		return numerator / denominator;
	}
	
}
