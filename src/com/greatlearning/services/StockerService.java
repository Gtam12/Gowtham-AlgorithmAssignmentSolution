package com.greatlearning.services;

import java.util.HashMap;

import com.greatlearning.models.Stocks;

public class StockerService {

	static Stocks stocks = new Stocks();
	static SortDescending sortD = new SortDescending();
	static SortAscending sortA = new SortAscending();

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

	public static void priceIncreasedStocks() {
		int increasedStocks = 0;

		for (int i = 0; i < stocks.isPriceHigherThanYesterday().size(); i++) {
			if (stocks.isPriceHigherThanYesterday().get(i).toUpperCase() == "TRUE") {
				increasedStocks += 1;
			}
		}

		System.out.println("Total no of companies whose stock price Increased today " + increasedStocks);

	}

	public static void priceDecreasedStocks() {
		int declinedStocks = 0;
		for (int i = 0; i < stocks.isPriceHigherThanYesterday().size(); i++) {
			if (stocks.isPriceHigherThanYesterday().get(i).toUpperCase() == "FALSE") {
				declinedStocks += 1;
			}
		}
		System.out.println("Total no of companies whose stock price Declined today " + declinedStocks);
	}

}
