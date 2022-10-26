package com.bridgelabz;

public class LargestThreeNumbers {

	public static void main(String[] args) {
		
		int x = -21, y = 03, z = -78;
		if(x >= y && x >= z) {
			System.out.println(x+" is Largest Number");
		}
		else if(y >= x && y >= z) {
			System.out.println(y+" is Largest Number");
		}
		else {
			System.out.println(z+" is Largest Number");
		}
	}
}
