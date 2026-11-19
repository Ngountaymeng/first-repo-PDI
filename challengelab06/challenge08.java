package challengelab06;
class RentalItem {
    double getCost() {
        return 0;
    }
}

class CarRental extends RentalItem {
    double getCost() {
        return 100;
    }
}

class BikeRental extends RentalItem {
    double getCost() {
        return 20;
    }
}

class ToolRental extends RentalItem {
    double getCost() {
        return 15;
    }
}

class CameraRental extends RentalItem {
    double getCost() {
        return 30;
    }
}
public class challenge08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentalItem[] items = { new CarRental(), new BikeRental(), new ToolRental(), new CameraRental()};
		for(RentalItem item : items) {
			System.out.println(item.getCost());
		}

	}

}
