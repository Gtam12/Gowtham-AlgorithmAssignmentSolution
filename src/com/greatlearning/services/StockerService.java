package com.greatlearning.services;

import java.util.ArrayList;

import com.greatlearning.models.Stocks;
import com.greatlearning.services.SortDescending;


public class StockerService {
	
	
	static Stocks stocks = new Stocks();
	static SortDescending sortD;
	
	public static ArrayList<Double> stocksInAscendingOrder() {
		

		
		return stocks.getStockPrice();
	}
	
	
	
	public static void stocksInDescendingOrder() {
		
		 sortD.sort(stocks.getStockPrice(), 0, stocks.getStockPrice().size()-1);
	
	}
	
	
	
	
	public static String isPriceHigher() {
		return stocks.isPriceHigherThanYesterday();
	}
	

}
