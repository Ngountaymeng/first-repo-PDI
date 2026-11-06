package lab4;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		ArrayList<String	> students = new ArrayList<>();
		File file = new File("Ex3StudentData.csv");
		try {
			Scanner fs = new Scanner(file);
			while(fs.hasNextLine()){
				String data = fs.nextLine();
				students.add(data);
			}
			fs.close();
		}catch (Exception e) {
			
		}
		System.out.println("Student Data: ");
		for (String student : students) {
			System.out.println(student);
		}
	}

}
