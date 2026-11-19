package challengelab06;
interface Trackable{
	void track();
}
abstract class DeliveryService{
	abstract void calculateETA();
}
class CourierService extends DeliveryService implements Trackable{
	public void track() {
		System.out.println("Courier Tracking...");
	}
	void calculateETA() {
		System.out.println("ETA: 2 Days");
	}
}
class DroneDelivery extends DeliveryService implements Trackable{
	public void track() {
		System.out.println("Drone Tracking...");
	}
	void calculateETA() {
		System.out.println("ETA: 2 Hours");
	}
}
class CargoTruck extends DeliveryService implements Trackable{
	public void track() {
		System.out.println("Truck Tracking...");
	}
	void calculateETA() {
		System.out.println("ETA: 5 Days");
	}
}
public class challenge03 {
	public static void main(String[] args) {
		CourierService c = new CourierService();
		c.track();
		c.calculateETA();
		
		DroneDelivery d = new DroneDelivery();
		d.toString();
		d.calculateETA();
	}
}
