package com.greatlearning.models;
import java.util.*;

public class Stocks {
	
	public   HashMap<Integer, Double> stockPrice = new HashMap<Integer, Double>();
	
	public   HashMap<Integer, String> isPriceHigherThanYesterday = new HashMap<Integer, String>();

	public HashMap<Integer,Double> getStockPrice() {

		return stockPrice;
		
	}

	public void setStockPrice(int size,double stockPrice) {	
		for(int i=0; i<size; i++)
		{
		this.stockPrice.put(i, stockPrice);	
		}
	}

	public HashMap<Integer, String> isPriceHigherThanYesterday() {
		return isPriceHigherThanYesterday;
	}

	public void setPriceHigherThanYesterday(int size, String isPriceHigherThanYesterday) {
		for(int i=0;i<size;i++)
		{
		this.isPriceHigherThanYesterday.put(i, isPriceHigherThanYesterday);
		}
	}
	
	

}
