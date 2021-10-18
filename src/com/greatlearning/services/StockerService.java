package com.greatlearning.services;

import java.util.HashMap;

import com.greatlearning.models.Stocks;

public class StockerService {

	static Stocks stocks = new Stocks();
	static SortDescending sortD;
	static SortAscending sortA;

	public static void stocksInAscendingOrder() {
		sortA.sort(stocks.getStockPrice(), 0, stocks.getStockPrice().size() - 1);
	}

	public static void stocksInDescendingOrder() {

		sortD.sort(stocks.getStockPrice(), 0, stocks.getStockPrice().size() - 1);

	}

	public static HashMap<Integer, String> isPriceHigher() {
		return stocks.isPriceHigherThanYesterday();
	}
	
	public static void isStockAvailableInPortfolio(double key) {
		
		int first = 0;
		int last = stocks.getStockPrice().size()-1;
		int mid = (first+last)/2;
		HashMap<Integer,Double> prtfl = new HashMap<Integer,Double>(stocks.getStockPrice());
		while(first<=last) {
			if(prtfl.get(mid) == key) {
				System.out.println("Stock" + key + "found");
			}
			else if(prtfl.get(mid)<key) {
				first = mid+1;
			}
			else {
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		
		if(first>last) {
			System.out.println("Stokc not found");
		}
		
	}

	
}
