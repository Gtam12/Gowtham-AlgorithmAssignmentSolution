package com.greatlearning.services;

import java.util.HashMap;

import com.greatlearning.models.Stocks;

public class StockerService {


	 SortDescending sortD = new SortDescending();
	 SortAscending sortA = new SortAscending();

	public  void stocksInAscendingOrder(Stocks stocks) {
		sortA.sort(stocks.getStockPrice(), 0, stocks.getStockPrice().size() - 1);
		System.out.println(stocks.getStockPrice());
	}

	public  void stocksInDescendingOrder(Stocks stocks) {
		sortD.sort(stocks.getStockPrice(), 0, stocks.getStockPrice().size() - 1);
		System.out.println(stocks.getStockPrice());
	}

	public  HashMap<Integer, String> isPriceHigher(Stocks stocks) {
		return stocks.isPriceHigherThanYesterday();
	}

	public  void isStockAvailableInPortfolio(double key, Stocks stocks) {

		int first = 0;
		int last = stocks.getStockPrice().size() - 1;
		int mid = (first + last) / 2;
		HashMap<Integer, Double> prtfl = new HashMap<Integer, Double>(stocks.getStockPrice());
		while (first <= last) {
			if (prtfl.get(mid) == key) {
				System.out.println("Stock" + key + "found");
			} else if (prtfl.get(mid) < key) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("Stokc not found");
		}

	}

	public  void priceIncreasedStocks(Stocks stocks) {
		int increasedStocks = 0;

		for (int i = 0; i < stocks.isPriceHigherThanYesterday().size(); i++) {
			if (stocks.isPriceHigherThanYesterday().get(i).toUpperCase() == "TRUE") {
				increasedStocks += 1;
			}
		}

		System.out.println("Total no of companies whose stock price Increased today " + increasedStocks);

	}

	public  void priceDecreasedStocks(Stocks stocks) {
		int declinedStocks = 0;
		for (int i = 0; i < stocks.isPriceHigherThanYesterday().size(); i++) {
			if (stocks.isPriceHigherThanYesterday().get(i).toUpperCase() == "FALSE") {
				declinedStocks += 1;
			}
		}
		System.out.println("Total no of companies whose stock price Declined today " + declinedStocks);
	}

}
