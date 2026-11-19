package challengelab06;
interface TrackViewsMixin {

    default void trackView() {
        System.out.println("View counted");
    }
}

interface DiscountMixin {

    default double applyDiscount(double price) {
        return price * 0.9;
    }
}

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class DigitalProduct extends Product
        implements TrackViewsMixin, DiscountMixin {

    DigitalProduct(String name) {
        super(name);
    }
}
public class challenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalProduct product = new DigitalProduct("E-Book");
		product.trackView();
		System.out.println("Discounted Price: " + product.applyDiscount(100));

	}

}
