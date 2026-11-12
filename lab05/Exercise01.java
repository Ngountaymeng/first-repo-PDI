package lab05;

public class Exercise01 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Sum of even number from 1 to 100");
		for(int i = 1; i<+100; i++) {
			if(i%2==0) {
				sum =+ i;
			}
		}
		System.out.println("Sum = " + sum);
	}
}
