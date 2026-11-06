package lab4;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] id = new int[3];
		String[] name = new String[3];
		String[] gender = new String[3];
		File file = new File("Ex3StudentData.csv");
		try {
			FileWriter fw = new FileWriter(file);
			for(int i = 0; i<3; i++) {
			System.out.println("Enter name of student number " + (i+1));
			name[i] = sc.nextLine();
			System.out.println("Enter ID of student number " + (i+1));
			id[i] = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter gender of student number " + (i+1));
			gender[i] = sc.nextLine();
			
			fw.write(name[i] + "," + id[i] + "," + gender[i] + "\n");
			
			}
			fw.close();
		}catch (Exception e) {
			 e.printStackTrace();
		}
		sc.close();
		
	}

}
