package lab05;

import java.util.stream.IntStream;

public class Exercise11 {
	public static void main(String[] args) {
		int number[] = {5,2,9,1,3,8};
		
		int max = IntStream.of(number)
							.max()
							.orElseThrow();
		
		int min = IntStream.of(number)
							.min()
							.orElseThrow();
		
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}
}
