package test;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		double x,X,X1,X2;
		System.out.println("==================================================");
		System.out.println("             Welcome to our program");
		System.out.println("      'Quadratic Equation Solver ax^2+bx+c=0'");
		System.out.println("==================================================");
		System.out.print("\n\n\nInput a: ");
		a = sc.nextInt();
		
		System.out.print("Input b: ");
		b = sc.nextInt();
		
		System.out.print("Input c: ");
		c = sc.nextInt();
		float delta = b*b-4*a*c;
		System.out.println("\n\n\n--------------------------------------------------");
		System.out.println("\n\n Answer of the equation "+a+"x^2+"+b+"x+"+c+"=0");
		if(a == 0) {
			X = (double)-c/b;
			System.out.println("There is only one root X = " + X);
		}else if(delta>0) {
			X1 = (-b + Math.sqrt(delta))/(2*a);
			X2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("The answer is X1 = " + X1);
			System.out.println("The answer is X2 = " + X2);
		}else if(delta == 0){
			x = -b/(2*a);
			System.out.println("There is a duplicate root X = " + x);
		}else {
			System.out.println("The answer is imaginary number!");
		}
		System.out.println("\n\n--------------------------------------------------");
		sc.close();
	}

}
