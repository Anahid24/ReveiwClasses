package com.syntax.reviewclass03;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Write a program to ask user to enter value for sale: yes or no
		* 
		*/
				
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there a sale going on");
		boolean isSale=scan.nextBoolean();
		if(!isSale) {
			System.out.println("you are not going for shopping");
		}else {
			System.out.println("Pleas enter which item you want to buy and also enter its price");
			String item=scan.next();
			double price=scan.nextDouble();
			double discountedPrice=0;
			if(price<20) {
				 discountedPrice=price*0.9; // price-price*.1
				System.out.println("After discount "+item+" the price of the item reduce from"+price+" to"+discountedPrice+"+");
				 
			}else if(price>=20 &&price<=100) {
				discountedPrice=price*0.8; // price-price*.1
				System.out.println("After discount "+item+" the price of the item reduce from"+price+" to"+discountedPrice+"+");

			}
			
		}
	}

}