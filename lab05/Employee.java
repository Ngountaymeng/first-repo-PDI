package lab05;

public class Employee {
	private String name;
	private int ID;
	private String position;
	private float salary;
	private String gender;
	
	Employee(){
		this.name = "Unknown";
		this.ID = 0;
		this.position = "Unknown";
		this.salary = 0;
		this.gender = "Unknown";
		
	}
	Employee(String name){
		this.name = name;
	}
	Employee(int ID, String name){
		this.ID = ID;
		this.name = name;
	}
	Employee(String name, String position, int ID){
		this(ID,name);
		this.position = position;
	}
	
	public void getname() {
		
	}
	public String setname() {
		return name;
	}
	public int setID() {
		return ID;
	}
	public String setpostion() {
		return position;
	}
	public float setsalary() {
		return salary;
	}
	public String setgender() {
		return gender;
	}
}