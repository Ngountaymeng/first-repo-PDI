package lab05;


public class Exercise04 {
	public static class Employee {
		private String name;
		private int ID;
		private String position;
		private double salary;
		
		public Employee(String name, int ID, String position, double salary){
			this.name = "Unknown";
			this.ID = 0;
			this.position = "Unknown";
			this.salary = 0;

			
		}
		Employee(String name, String position, int ID, double salary){
			this.name = name;
			this.ID = ID;
			this.position = position;
			this.salary = salary;
		}
		
		public void setname(String name) {
			this.name = name;
		}
		public void setID(int ID) {
			this.ID = ID;
		}
		public void setpostion(String position) {
			this.position = position;
		}
		public void setsalary(double salary) {
			this.salary = salary;
		}
		
		public String getname() {
			return name;
		}
		public int getID() {
			return ID;
		}
		public String getposition() {
			return position;
		}
		public double getsalary() {
			return salary;
		}
		
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Dara","Software developer",111,10000);
		
		System.out.println("Employee detail:");
		
		System.out.println("Name: " + emp.getname());
		System.out.println("Position: " + emp.getposition());
		System.out.println("ID: " + emp.getID());
		System.out.println("Salary: " + emp.getsalary());
		emp.setsalary(30000);
		emp.setpostion("Senior Software Developer");
		
		System.out.println("update datail: ");
		System.out.println("Position: " + emp.getposition());
		System.out.println("Salary: " + emp.getsalary());
	}
}
