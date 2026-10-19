package test;

import java.util.Scanner;
import java.util.Arrays;

public class Ex3 {
	public static void main (String[] args ) {
		Scanner sc = new Scanner(System.in);
		int min,max;
		int[] num = new int[5];
		System.out.println("Please enter 5 numbers:");
		num[0] = sc.nextInt();
		min = max = num[0];
		for(int i = 1; i<5 ; i++ ) {
			num[i] = sc.nextInt();
			min = Math.min(min, num[i]);
			max = Math.max(max, num[i]);
		}
		System.out.println("Among all the five input numbers ("+num[0]+", "+num[1]+", "+num[2]+", "+num[3]+", "+num[4]+"),");
		System.out.println("min is "+min+" and max is "+max);
		sc.close();
	}
}
