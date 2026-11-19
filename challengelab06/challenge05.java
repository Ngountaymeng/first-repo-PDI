package challengelab06;
class PatientRecord{
	private String ssn = "111-222";
	protected String medicalHistory = "Diabetes";
	
	void showSSN() {
		System.out.println(ssn);
	}
}
class OutpatientRecord extends PatientRecord	{
	void dispay() {
		System.out.println(medicalHistory);
	}
}
class InpatientRecord extends PatientRecord{
	void display(){
		System.out.println(medicalHistory);
	}
}
public class challenge05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutpatientRecord o = new OutpatientRecord();
		o.dispay();
		o.showSSN();

	}

}
