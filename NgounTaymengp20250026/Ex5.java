package test;

import java.util.Scanner;

public class Ex5 {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean prime;
		int n;
		System.out.println("Put a number (n) to display prime number from 2 to n:");
		n = sc.nextInt();
		System.out.println("Prime number from 2 to n: ");
		for(int i = 2; i<n; i++) {
			prime = true;
			for(int j = 2; j<i ;j++) {
				if (i%j==0) {
					prime = false;
				}
			}
			if(prime) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
