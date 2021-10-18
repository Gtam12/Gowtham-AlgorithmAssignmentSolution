package com.greatlearning.models;
import java.util.*;

public class Stocks {
	
	public   ArrayList<Double> stockPrice = new ArrayList<Double>();
	
	public   String isPriceHigherThanYesterday;

	public ArrayList<Double> getStockPrice() {

		return stockPrice;
		
	}

	public void setStockPrice(Double stockPrice) {	
		this.stockPrice.add(stockPrice);		
	}

	public String isPriceHigherThanYesterday() {
		return isPriceHigherThanYesterday;
	}

	public void setPriceHigherThanYesterday(String isPriceHigherThanYesterday) {
		this.isPriceHigherThanYesterday = isPriceHigherThanYesterday;
	}
	
	

}
