//Creating and importing packages
package com.greatlearning.main;
import com.greatlearning.service.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		//Creating object of the service class
		MergeSortImplementation ms = new MergeSortImplementation();
		
		//Declaring the scanner class
		Scanner sc = new Scanner(System.in);
		
		//Taking the required inputs from user
		System.out.println("Enter the number of stock price you want to enter");
				
		int stock_size = sc.nextInt();
		double array_stockprice[] = new double[stock_size];
		boolean array_stockpricecomparision[] = new boolean[stock_size];
		
		//Display Variable
		int display_variable = 1;
		//Taking the required stock price related details from user
		for(int i=0;i<stock_size;i++) 
		{
			display_variable = display_variable+i;
			System.out.println("Enter the stock price of Company " +display_variable);
			array_stockprice[i] = sc.nextDouble();
			System.out.println("Enter TRUE if stock price has increased compared to yesterday else enter False for Company " +display_variable);
			array_stockpricecomparision[i] = sc.nextBoolean();
		}
		
		//Displaying the menu to user
		displayMenu();
		
		int choice;
		
		//Performing the required task as per the entered choice
		do {
		System.out.println("Enter your choice");
		choice = sc.nextInt();
	
		
		switch(choice) {
		
		//Arranging the stock price in ascending order
		case 1:
		//Calling the sort function(Merge Sort
		ms.mergesort(array_stockprice,0,array_stockprice.length-1);
			
		System.out.println("Stock prices in ascending order are:");
		for(int i=0;i<array_stockprice.length;i++)
		{
			System.out.println(array_stockprice[i]+"");
				
		}
		break;
		
		//Arranging the stock price in descending order
		case 2:
		//Calling the sort function(Merge Sort
		ms.mergesort(array_stockprice,0,array_stockprice.length-1);
		
		//Declaring an array to store the value in descening order
		double array_descending_order[] = new double[stock_size];
		//Creating a working variable
		int stock_size_descending = stock_size-1;
		
		//Arranging the stock price in descending order
		for(int j=0;j<array_stockprice.length;j++)
		{
			array_descending_order[j]=array_stockprice[stock_size_descending];
			stock_size_descending = stock_size_descending-1;
						
		}
		
		//Displaying the stock price in descending order
		System.out.println("Stock prices in descending order are:");
		for(int m=0;m<array_descending_order.length;m++)
		{
			System.out.println(array_descending_order[m]+"");
						
		}
		
		break;
			
		//Displaying the number of stock whose daily price increased
		case 3:
			//Declaring counter variable
			int number_increase_stockprice =0;
			for(int k=0;k<array_stockpricecomparision.length;k++)
			{
				if(array_stockpricecomparision[k])
				{
					number_increase_stockprice = number_increase_stockprice+1;
				}
			}
			System.out.println("Total no of companies whose stock price increased today are/is:" +number_increase_stockprice);
			
			break;
		
		//Displaying the number of stock whose daily price decreased
		case 4:
			//Declaring counter variable
			int number_decrease_stockprice =0;
			for(int l=0;l<array_stockpricecomparision.length;l++)
			{
				if(!array_stockpricecomparision[l])
				{
					number_decrease_stockprice = number_decrease_stockprice+1;
				}
			}
			System.out.println("Total no of companies whose stock price declined today are/is:" +number_decrease_stockprice);
			
			break;
			
		//Searching for the user entered stock price
		case 5:
		//Taking the required inputs from user
		System.out.println("Enter the stock price you want to check");
					
		double stock_price = sc.nextDouble();
		
		//Declaring counter
		int counter = 0;
		
		//Searching for the stock price
		for(int m=0;m<array_stockprice.length;m++)
		{
			if(array_stockprice[m]==stock_price) 
			{
				System.out.println("Stock of value " +stock_price+ " is present");
				break;
			}
			
			counter = counter +1;
		}
		
		if(counter == array_stockprice.length)
		{
			System.out.println("Stock of value " +stock_price+ " is not present");	
		}break;
			
			
		}
		
		}while(choice!=6);
		
		System.out.println("Exited Successsfully");
	}
	
	private static void displayMenu() {
		
		System.out.println("----------------");
		
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. Exit");
		
		System.out.println("----------------");
		
		
	}

}
