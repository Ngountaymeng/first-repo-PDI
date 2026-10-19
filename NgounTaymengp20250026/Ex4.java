package test;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yyyy,mm,dd;
		boolean valid = false;
		System.out.println("Input your date(yyyy-mm-dd):");
		System.out.println("Year: ");
		yyyy = sc.nextInt();
		System.out.println("Month: ");
		mm = sc.nextInt();
		System.out.println("Day: ");
		dd = sc.nextInt();
		System.out.println("Your date is " + yyyy + "-" + mm + "-" + dd);
		if ( yyyy > 0) {
			if (mm > 12 || mm < 1) {
				valid = true;
			}else if( mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm ==10 || mm == 12) {
				if (dd < 1 || dd > 31) {
					valid = true;
				}
			}else if( mm == 4 || mm == 6 || mm == 9 || mm == 11 ) {
				if (dd < 1 || dd >30 ) {
					valid = true;
				}
			}else if ( mm == 2) {
				if ((yyyy%4) == 0 || (yyyy%1000) == 0) {
					if (dd <1 || dd >29) {
						valid = true;
					}
				}
				else if ((yyyy%100) == 0 ){
					if (dd < 1 || dd > 28) {
						valid = true;
						}
					}
				}
			}
		if(valid) {
			System.out.println("invalid");
		}else {
			System.out.println("valid");
		}
		sc.close();
	}
}
