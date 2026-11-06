package lab4;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
//import java.io.IOException;

public class Updatefile {
	public static void main(String[] args) {
	File testfile = new File("StuData.csv");
	try {
// String datatofile = sc.nextLine();
		FileWriter fw = new FileWriter(testfile);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println("Enter you ID");
		int id = sc.nextInt();
		System.out.println("Enter you Phone Number");
		int ph = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter you Gender");
		String gender = sc.nextLine();
		System.out.println("Enter you Major");
		String major = sc.nextLine();
		fw.write(name+","+id+","+ph+","+gender+","+major);
		fw.close();
		sc.close();
	}catch (Exception e){
		e.printStackTrace();
	}
}
}