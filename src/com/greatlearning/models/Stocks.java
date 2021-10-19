package com.greatlearning.models;
import java.util.*;

public class Stocks {
	
	public   HashMap<Integer, Double> stockPrice = new HashMap<Integer, Double>();
	
	public   HashMap<Integer, String> isPriceHigherThanYesterday = new HashMap<Integer, String>();

	public HashMap<Integer,Double> getStockPrice() {

		return stockPrice;
		
	}

	public void setStockPrice(int size,double stockPrice) {	
		
		this.stockPrice.put(size, stockPrice);	
		
	}

	public HashMap<Integer, String> isPriceHigherThanYesterday() {
		return isPriceHigherThanYesterday;
	}

	public void setPriceHigherThanYesterday(int size, String isPriceHigherThanYesterday) {
		
		this.isPriceHigherThanYesterday.put(size, isPriceHigherThanYesterday);
		
	}
	
	

}
