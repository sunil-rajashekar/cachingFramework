package org.thinkbigprg.domain;

public class Currency {
	private String sourceCurrency;
	private String destinationCurrency;
	private double exchangeRate;

	public String getSourceCurrency() {
		return sourceCurrency;
	}

	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	public String getDestinationCurrency() {
		return destinationCurrency;
	}

	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Currency(String sourceCurrency, String destinationCurrency, double exchangeRate) {
		super();
		this.sourceCurrency = sourceCurrency;
		this.destinationCurrency = destinationCurrency;
		this.exchangeRate = exchangeRate;
	}

	@Override
	public String toString() {
		return "Currency [sourceCurrency=" + sourceCurrency + ", destinationCurrency=" + destinationCurrency
				+ ", exchangeRate=" + exchangeRate + "]";
	}

}
