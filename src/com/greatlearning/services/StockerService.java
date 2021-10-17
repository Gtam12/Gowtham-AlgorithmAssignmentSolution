package com.greatlearning.services;

import com.greatlearning.models.Stocks;;

public class StockerService {
	
	
	Stocks stocks = new Stocks();
	
	public double[] stocksInAscendingOrder() {
		
		double[] stocksInAscending = stocks.getStockPrice();
		
		
		
		return stocksInAscending;
	}
	

}
