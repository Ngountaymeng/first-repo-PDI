package lab4;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Luckynumber {
	public static void main(String[] args) {
		File f = new File("LuckyNumber.csv");
		for(int i = 1; i<= 500; i++) {
			try {
				Random num = new Random();
				int n = num.nextInt(500) + 1;
				
				FileWriter fw = new FileWriter(f,true);
				fw.write("Lucky Number,");
				fw.write(n + "\n");
				System.out.println("Lucky Number:" + n);
				fw.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
