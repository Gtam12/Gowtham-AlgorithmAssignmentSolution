package com.greatlearning.driver;


import java.util.Scanner;
import com.greatlearning.models.Stocks;
import com.greatlearning.services.StockerService;

public class Driver {

	static Scanner sc = new Scanner(System.in);
	static Stocks stocks = new Stocks();
	static StockerService stockerService = new StockerService();

	public static void main(String[] args) {

		System.out.println("enter the no of companies");

		int numberOfCompanies = sc.nextInt();

		for (int i = 0; i < numberOfCompanies; i++) {

			System.out.println("Enter current stock price of the company " + ((int) i + 1));
			stocks.setStockPrice(sc.nextDouble());
			stocks.setPriceHigherThanYesterday(sc.next());

		}

		System.out.println("-----------------------------");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total number of companies for which stock prices rose today");
		System.out.println("4. Display the total number of companies for which stock prices declined today");
		System.out.println("5. Search a specific Stock price");
		System.out.println("-----------------------------");

		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println(stockerService.stocksInAscendingOrder());	
		    System.out.println(stockerService.isPriceHigher());
		
		
		}
		
		
		
	}

}
