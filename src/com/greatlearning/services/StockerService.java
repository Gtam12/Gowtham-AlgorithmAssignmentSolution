package com.greatlearning.services;

import java.util.ArrayList;

import com.greatlearning.models.Stocks;
import com.greatlearning.services.SortDescending;
import com.greatlearning.services.SortAscneding;

public class StockerService {
	
	
	static Stocks stocks = new Stocks();
	static SortDescending sortD = new SortDesecending();
	
	public static ArrayList<Double> stocksInAscendingOrder() {
		

		
		return stocks.getStockPrice();
	}
	
	
	
	public static double[] stocksInDescendingOrder() {
		
	
	}
	
	
	
	
	public static String isPriceHigher() {
		return stocks.isPriceHigherThanYesterday();
	}
	

}
