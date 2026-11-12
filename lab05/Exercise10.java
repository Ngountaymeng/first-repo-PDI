package lab05;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Exercise10 {

	public static void main(String[] args) {
		List<String> students = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("Ex3StudentData.csv"))){
			String line;
			while((line = br.readLine()) != null) {
				students.add(line.trim());
			}
			System.out.println("Students in A-Z order: ");
			
			students.stream()
					.sorted()
					.forEach(System.out::println);
		}catch(IOException e) {
			System.out.println("Error reading file" + e.getMessage());
		}

	}

}
