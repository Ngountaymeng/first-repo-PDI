package lab4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.io.PrintWriter;
import java.io.File;
public class Exercise05 {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		
		try {
			Scanner fs = new Scanner(new File("Ex3StudentData.csv"));
			while(fs.hasNextLine()) {
				students.add(fs.nextLine());
			}
			fs.close();
			
			students.add("dara,4,male");
			students.add("bopha,5,female");
			students.add("thida,6,female");
			
			Collections.sort(students, new Comparator<String>() {

				public int compare(String s1, String s2) {
					String name1 = s1.split(",")[0];
					String name2 = s2.split(",")[0];
					return name1.compareToIgnoreCase(name2);
				}
				
			});
			
			PrintWriter fw = new PrintWriter("Ex3StudentData.csv");
			for (String student: students) {
				fw.println(student);
			}
			fw.close();
			System.out.println("Data updated succesfully!");
		}catch (Exception e) {
			 e.printStackTrace();
		}
	}
}
