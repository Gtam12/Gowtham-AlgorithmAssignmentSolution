package com.greatlearning.services;

import java.util.ArrayList;

import com.greatlearning.models.Stocks;



public class StockerService {
	
	
	static Stocks stocks = new Stocks();
	static Sort sort;
	
	public static void stocksInAscendingOrder() {	
		sort.sort(stocks.getStockPrice(), 0, stocks.getStockPrice().size()-1, true);
	}
	
	
	
	public static void stocksInDescendingOrder() {
		
		 sort.sort(stocks.getStockPrice(), 0, stocks.getStockPrice().size()-1, false);
	
	}
	
	
	
	
	public static String isPriceHigher() {
		return stocks.isPriceHigherThanYesterday();
	}
	

}
