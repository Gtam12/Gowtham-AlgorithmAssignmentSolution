package com.greatlearning.services;

import java.util.ArrayList;

import com.greatlearning.models.Stocks;;

public class StockerService {
	
	
	static Stocks stocks = new Stocks();
	
	public static ArrayList<Double> stocksInAscendingOrder() {
		
		ArrayList<Double> stocksInAscending = new ArrayList<Double>(stocks.getStockPrice());
		
		
		
		return stocksInAscending;
	}
	
	
	public static String isPriceHigher() {
		return stocks.isPriceHigherThanYesterday();
	}
	

}
