package com.thehit.domain;
import com.thehit.interfaces.Currency;

public class Pounds implements Currency{

	private static final String GBP = "GBP";
	
	public String getSymbol() {
		return GBP;
	}
}
