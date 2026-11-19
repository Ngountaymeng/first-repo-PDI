package challengelab06;
class InsurancePolicy{
		void calculate_premium() {
			System.out.println("Basic Insurance Premium");
		}
	}
	class HealthInsurance extends InsurancePolicy {
		void calculate_premium() {
			System.out.println("Health Insurance premium = $1000");
		}
	}
	class CarInsurance extends InsurancePolicy {
		void calculate_premium() {
			System.out.println("Car insurance premium = $500");
		}
		void cacluate_premium(int age) {
			System.out.println("Premium based on age: " + age);
		}
		void caclulate_premium(int age, int accidents) {
			System.out.println("Premium base on age " + age + " and accidnets " + accidents);
		}
	}
public class challenge01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsurancePolicy p1 = new HealthInsurance();
		InsurancePolicy p2 = new CarInsurance();
		
		p1.calculate_premium();
		p2.calculate_premium();
		
		CarInsurance car = new CarInsurance();
		car.cacluate_premium(25);
		car.caclulate_premium(20, 5);

	}

}
