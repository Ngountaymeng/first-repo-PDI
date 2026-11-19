package challengelab06;
class Person {
    void work() {
        System.out.println("Person works");
    }

    String getRole() {
        return "Person";
    }
}

class Employee extends Person {

    @Override
    void work() {
        System.out.println("Employee works");
    }

    @Override
    String getRole() {
        return "Employee";
    }
}

abstract class Teacher extends Employee {
    abstract String getRole();
}

class MathTeacher extends Teacher {

    void work() {
        System.out.println("Teaching Mathematics");
    }

    String getRole() {
        return "Math Teacher";
    }
}

class ScienceTeacher extends Teacher {

    void work() {
        System.out.println("Teaching Science");
    }

    String getRole() {
        return "Science Teacher";
    }
}
public class challenge09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new MathTeacher();
		Person p2 = new ScienceTeacher();
		
		p1.work();
		System.out.println(p1.getRole());
		
		p2.work();
		System.out.println(p2.getRole());

	}

}
