package com.greatlearning.driver;


import java.util.Scanner;
import com.greatlearning.models.Stocks;
import com.greatlearning.services.SortAscending;
import com.greatlearning.services.StockerService;

public class Driver {

	static Scanner sc = new Scanner(System.in);
	static Stocks stocks = new Stocks();
	static StockerService stockerService = new StockerService();
	static SortAscending sortA = new SortAscending();

	static int displayMenu() {
		System.out.println("-----------------------------");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total number of companies for which stock prices rose today");
		System.out.println("4. Display the total number of companies for which stock prices declined today");
		System.out.println("5. Search a specific Stock price");
		System.out.println("Press 0 to exit");
		System.out.println("-----------------------------");

		int choice = sc.nextInt();

		return choice;

	}

	public static void main(String[] args) {

		System.out.println("enter the no of companies");
		int numberOfCompanies = sc.nextInt();

		for (int i = 0; i < numberOfCompanies; i++) {

			System.out.println("Enter current stock price of the company " + ((int) i + 1));
			stocks.setStockPrice(i, sc.nextDouble());
			stocks.setPriceHigherThanYesterday(i, sc.next());

		}

		int choice = displayMenu();

		switch (choice) {

		case 0:
			System.out.println("Exited Succesfully");
			return;

		case 1:
			stockerService.stocksInAscendingOrder(stocks);
			System.out.println(stockerService.isPriceHigher(stocks));
			break;
		case 2:
			stockerService.stocksInDescendingOrder(stocks);
			System.out.println(stockerService.isPriceHigher(stocks));
			break;

		case 3:
			stockerService.priceIncreasedStocks(stocks);
			break;

		case 4:
			stockerService.priceDecreasedStocks(stocks);
			break;

		case 5:
			System.out.println("Enter the stock to search");
			double key = sc.nextDouble();
			stockerService.isStockAvailableInPortfolio(key,stocks);
			break;

		default:

			break;

		}

	}

}
