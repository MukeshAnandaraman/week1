package com.prodapt.Iprimed;

public class SimpleInterest {

	
	    static double interestRate = 12.12;
		static double principleBalance = 120000.12;
		static int time = 2;

		public static void main(String[] args) {
			double finalAmount;
			finalAmount = principleBalance*(1+(interestRate*time));
			System.out.println("The Final Amount was " + finalAmount);
		}

	}


