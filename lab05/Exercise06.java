package lab05;

public class Exercise06 {
	public static class Rectangle{
		private double width;
		private double height;
		
		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
		public double getwidth() {
			return width;
		}
		public double getheight() {
			return height;
		}
		
		public void setwidth(double width) {
			this.width = width;
		}
		public void setheight(double height) {
			this.height = height;
		}
		
		public double calculateArea() {
			return width*height;
		}
		public double calculatePerimeter() {
			return 2*(width+height);
		}
	}
	public static class Circle{
		private double radius;
		
		public Circle(double radius) {
			this.radius = radius;
		}
		
		public double getradius() {
			return radius;
		}
		
		public void setradius(double radius) {
			this.radius = radius;
		}
		
		public double calculateArea() {
			return Math.PI*radius*radius;
		}
		public double calculatePerimenter() {
			return Math.PI*2*radius;
		}
	}
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(20,10);
		
		System.out.println("Rectangle");
		System.out.println("Width: " + rec.getwidth());
		System.out.println("Height: " + rec.getheight());
		System.out.println("Area: " + rec.calculateArea());
		System.out.println("Perimenter: " + rec.calculatePerimeter());
		
		Circle circle = new Circle(4);
		
		System.out.println("Circle");
		System.out.println("Radius: " + circle.getradius());
		System.out.println("Area: " + circle.calculateArea());
		System.out.println("Perimenter: " + circle.calculatePerimenter());
	}

}
