package challengelab06;
class Discount{
	double apply(double amount) {
		return amount - (amount*0.05);
	}
}
class SeasonalDiscount extends Discount{
	double apply(double amount) {
		double afterBaseDiscount = super.apply(amount);
		return amount - (amount*0.1);
	}
}
public class challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 100;
		
		Discount d = new Discount();
		System.out.println("Base discount: " + d.apply(amount));
		
		SeasonalDiscount sd = new SeasonalDiscount();
		System.out.println("Seasonal discount: " + sd.apply(amount));

	}

}
