package lab05;
import java.util.Scanner;

import lab3.Student;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
public class Exercise07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter a number(n) to find sum from 1 to n:");
		n = sc.nextInt();
		Thread th1 = new Thread(){
			int sum = 0;
			public void run() {
				for(int i = 1; i<=n;i++) {
				sum += i;
				}
				System.out.println("Sum from 1 to "+ n + " " + sum);
			}
			
		};
		Thread th2 = new Thread() {
			boolean prime;
			public void run() {
				System.out.println("All prime number from 1 to 100:");
				for (int i = 2; i<=100; i++) {
					prime = true;
					for (int j=2; j<i;j++) {
						if(i%j==0) {
							prime = false;
						}
					}
					if(prime) {
						System.out.println(i+" is prime number");
					}
				}
			}
		};
		
		Thread th3 = new Thread() {
			public void run() {
				ArrayList<String> students = new ArrayList<>();
				
				try {
					BufferedReader br = new BufferedReader(new FileReader("Ex3StudentData.csv"));
					String line;
					while ((line = br.readLine()) != null) {
						String[] data = line.split(",");
						
						String name = data[0];
						String id = data[1];
						String gender = data[2];
						
						students.add(name + " " + id + " " + gender);
						
						
						System.out.println("\nStudent List: ");
						for(String s : students) {
							System.out.println( s);
						}
						br.close();
					}
				}catch (Exception e) {
					
				}
				
			}
		};
		th1.start();
		th2.start();
		th3.start();
		sc.close();
	}

}
