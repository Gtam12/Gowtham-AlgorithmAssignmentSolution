package com.greatlearning.services;

import java.util.ArrayList;

import com.greatlearning.models.Stocks;

public class StockerService {

	static Stocks stocks = new Stocks();
	static Sort sort;

	public static void stocksInAscendingOrder() {
		sort.sort(stocks.getStockPrice(), 0, stocks.getStockPrice().size() - 1, true);
	}

	public static void stocksInDescendingOrder() {

		sort.sort(stocks.getStockPrice(), 0, stocks.getStockPrice().size() - 1, false);

	}

	public static String isPriceHigher() {
		return stocks.isPriceHigherThanYesterday();
	}
	
	public static void isStockAvailableInPortfolio(double key) {
		
		int first = 0;
		int last = stocks.getStockPrice().size()-1;
		int mid = (first+last)/2;
		ArrayList<Double> prtfl = new ArrayList<Double>(stocks.getStockPrice());
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
