package lab05;
import java.util.Arrays;
import java.util.List;
public class Exercise09 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,2,9,-1,3,-8,20,-50);
		
		System.out.println("Cube of each number: ");
		numbers.stream()
				.map(n -> n*n*n)
				.forEach(n -> System.out.print(n + " "));
		
		System.out.println("\nPosivtive numbers: ");
		numbers.stream()
				.filter(n -> n>0)
				.forEach(n -> System.out.print(n + " "));
		
		System.out.println("\nSorted numbers: ");
		numbers.stream()
				.sorted()
				.forEach(n -> System.out.print(n + " "));

	}

}
