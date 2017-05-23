package com.ruslanito.Core.Core_Exeption;

class ExceptionTest {
	// create exception
	static void genException() {
		int nums[] = new int[5];
		System.out.println("***");
		nums [7] = 10;
		System.out.println("*"+nums[7]+"*");
	}
}

public class TryCatch_2Classes {
	public static void main(String[] args) {
		//create try-catcn block
		try{
			ExceptionTest.genException();
		}catch (Exception e){
			System.out.println("catch work!");
		}
		System.out.println("try-catch block ends!");
	}
}
