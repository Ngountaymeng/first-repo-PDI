package test;

import java.util.Scanner;

public class Lab1Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		int sum = 0;
		double ave;
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		for(int k = 1000; k>=number; k--) {
			System.out.print(k + " ");
			sum +=k ;
		}
		ave = sum/(1000-number+1);
		System.out.println("\nSum = " + sum );
		System.out.println("Average = " + ave);
	}
}