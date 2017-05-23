package com.ruslanito.Core.Core_Exeption;

public class TryCatch1 {
	public static void main(String[] args) {
		// create array num
		int num[] = new int[4];
		// create try-block
		try {
			System.out.println("Before exception:");
			// use outrange index
			num[5] = 10;
			System.out.println("******");
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Out of num array range!");
		}
		System.out.println("After Try_Catch block");

	}
}
