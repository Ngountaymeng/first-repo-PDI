package lab05;

public class TestCP2 extends Thread {
	public void run() {
		for (int k = 1; k<=500; k++) {
			System.out.println("FROM THREAD: " + k);
		}
	}
	public static void main(String[] args) {
		TestCP2 tcp = new TestCP2();
		tcp.start();
		
		System.out.println(" MAIN *****");
		System.out.println(" Done yet *****");
		System.out.println(" OK *****");
	}
}
