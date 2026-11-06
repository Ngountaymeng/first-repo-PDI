package lab4;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileWriter;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number of file you want to create:");
		n = sc.nextInt();
		
		File folder = new File("Ex2Luckynumber");
		if(!folder.exists()) {
			folder.mkdir();
		}
		try {
			for ( int i = 1; i <= n; i++) {
				File file = new File(folder, "file" + i + ".csv");
				FileWriter fw = new FileWriter(file);
				for (int j = 0; j<10; j++) {
					Random num = new Random();
					int luckynum = num.nextInt(100) + 1;
					fw.write(luckynum + "\n");
				}
				fw.close();
			}
			
		}catch (Exception e) {
			 e.printStackTrace();
		}
		ArrayList<Integer> numbers = new ArrayList<>();
		try {
			
			for (int i = 1; i<=n; i++) {
				File file = new File(folder,"file"+i+".csv");
				Scanner fileScanner = new Scanner(file);
				while(fileScanner.hasNextInt()) {
					numbers.add(fileScanner.nextInt());
				}
				fileScanner.close();
			}
			
		}catch (Exception e) {
			 e.printStackTrace();
		}
		if(!numbers.isEmpty()) {
			int max = Collections.max(numbers);
			int min = Collections.min(numbers);
			
			System.out.println("All number: " + numbers);
			System.out.println("Maximum: " + max);
			System.out.println("Minimum: " + min);
		}
		
		
		sc.close();
	}

}
