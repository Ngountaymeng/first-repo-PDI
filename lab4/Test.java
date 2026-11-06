package lab4;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Test {
	public static void main(String[] args) {
		String name;
		for (int k=1; k <= 100 ; k++) {
			name = "myfile" + k + ".csv";
			File f = new File(name);
			try {
				if(f.createNewFile()) {
					System.out.println("Created!");
				}
				FileWriter fw = new FileWriter(f);
				
				fw.write("Hi!, Welcome to, Java IO\n");
				fw.write("I thingk, i am ready to, lab 04");
				
				fw.close();
			} catch (IOException e) {
				
			}
		
		}
		
		System.out.println("Bye");
	}
}
