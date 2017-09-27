package com.thehit.domain;
import com.thehit.interfaces.Currency;

public class Euro implements Currency{

	private static final String EUR = "EUR";

	public String getSymbol() {
		return EUR;
	}
}


