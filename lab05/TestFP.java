package lab05;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class TestFP {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,9,10,0,1,6);
		
		
		numbers.stream()
				.map(p -> p*2)
				.filter(n -> n%2==0)
				.sorted()
				.forEach(System.out::println);
		System.out.println("\n======================\n");
		
		Arrays.asList(10,20,900,88800,111110,98762,6)
				.stream()
				.map(k -> k%100)
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
		System.out.println("\n======================\n");
//		List<String> names = Arrays.asList("a","l","r","d","t","m");
//		names.
	}

}
