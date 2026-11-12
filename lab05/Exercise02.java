package lab05;
import java.util.Scanner;
public class Exercise02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice,n;
		double num1,num2,add,sub,mul,div,sum=0;
		do {
			System.out.println("======= Calculator Manu ====== ");
			System.out.println("1. Addition (+) ");
			System.out.println("2. Subtraction (-) ");
			System.out.println("3. Multiplication (×) ");
			System.out.println("4. Division (/) ");
			System.out.println("5. Sum all number from 1 to n ");
			System.out.println("6. Exit ");
			System.out.println("============================== ");
			
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					System.out.println("Enter two numbers:");
					System.out.println("Num1: ");
					num1 = sc.nextInt();
					System.out.println("Num2: ");
					num2 = sc.nextInt();
					add = num1 + num2;
					System.out.println("Answer is " + add);
					break;
				}
				case 2:{
					System.out.println("Enter two numbers: ");
					System.out.println("Num1: ");
					num1 = sc.nextInt();
					System.out.println("Num2: ");
					num2 = sc.nextInt();
					sub = num1 - num2;
					System.out.println("Answer is " + sub);
					break;
				}
				case 3:{
					System.out.println("Enter two numbers: ");
					System.out.println("Num1: ");
					num1 = sc.nextInt();
					System.out.println("Num2: ");
					num2 = sc.nextInt();
					mul = num1 * num2;
					System.out.println("Answer is " + mul);
					break;
				}
				case 4:{
					System.out.println("Enter two numbers: ");
					System.out.println("Num1: ");
					num1 = sc.nextInt();
					System.out.println("Num2: ");
					num2 = sc.nextInt();
					div = num1 / num2;
					System.out.println("Answer is " + div);
					break;
				}
				case 5:{
					System.out.println("Enter any number you want: ");
					n = sc.nextInt();
					for(int i = 1; i<=n; i++) {
						sum =+ i;
					}
					System.out.println("Answer is " + sum);
					break;
				}
			}
			
		}while(choice != 6);
		System.out.println("Thank you!");
		sc.close();
	}
}
