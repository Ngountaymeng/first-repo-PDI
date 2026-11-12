package lab05;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		
		Runnable task1 = () -> {
			int sum = 0;
			for(int i = 1; i<=n; i++) {
				sum += i;
			}
			System.out.println("Sum from 1 to " + n + " = " + sum);
		};
		
		Runnable task2 = () -> {
			System.out.println("\nPrime number from 1 to 100:");
			for (int i = 2; i<=100; i++) {
				boolean prime = true;
				for (int j = 2; j<i; j++) {
					if (i%j == 0) {
						prime = false;
						break;
					}
				}
				if(prime) {
					System.out.println(i + " is prime number");
				}
			}
		};
		
		Runnable task3 = () -> {
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
					
				}
				br.close();
			}catch (Exception e) {
				 System.out.println(e.getMessage());
			}
		};
		
		Thread th1 = new Thread(task1);
		Thread th2 = new Thread(task2);
		Thread th3 = new Thread(task3);
		
		th1.start();
		th2.start();
		th3.start();
		
		sc.close();
	}

}
