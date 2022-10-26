package com.bridgelabz;

import java.util.Scanner;

public class NumberEvenOrOdd {

	public static void main(String[] args) {

		 Scanner read = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = read.nextInt();

	        if(num % 2 == 0)
	            System.out.println(num + " is even");
	        else
	            System.out.println(num + " is odd");
	        read.close();
	}
}
