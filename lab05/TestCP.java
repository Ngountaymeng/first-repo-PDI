package lab05;

public class TestCP {
	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
			for (int k = 50;k>0;k--) {
				System.out.println(k);
				}
			}
		};
		Thread th2 = new Thread() {
			public void run() {
				for (int k = 100; k<130;k++) {
					System.out.println("Th2: " + k);
				}
			}
		};
			
		th.start();
		th2.start();
		
	}
}
