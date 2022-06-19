package com.syntax.reviewclass04;

import java.util.Scanner;

public class WhileLoopDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// take the input from the the user using scanner
		// increment it by 2 print it
		// if value is 10 terminate the program
		
		//starting point
		int x=0;
		Scanner scanner=new Scanner(System.in);
		while (x!=10) {
			System.out.println("Please enter the number");
			x=scanner.nextInt();
			System.out.println(x+2);
		}
		scanner.close();

	}

}