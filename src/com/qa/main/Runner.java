package com.qa.main;

import java.util.Scanner;

public class Runner {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		ScannerController.scannerController();
		
		
		//GI -> GO
		
		input.close();
		
		System.out.println("\ninput closed");
		
	}

}
