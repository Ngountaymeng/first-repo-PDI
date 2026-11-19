package challengelab06;
abstract class Document{
	void generate() {
		writeHeader();
		writeBody();
		writeFooter();
	}
	abstract void writeHeader();
	abstract void writeBody();
	abstract void writeFooter();
}
class InvoiceDocument extends Document {

    void writeHeader() {
        System.out.println("Invoice Header");
    }

    void writeBody() {
        System.out.println("Invoice Body");
    }

    void writeFooter() {
        System.out.println("Invoice Footer");
    }
}

class ResumeDocument extends Document {

    void writeHeader() {
        System.out.println("Resume Header");
    }

    void writeBody() {
        System.out.println("Resume Body");
    }

    void writeFooter() {
        System.out.println("Resume Footer");
    }
}
public class challenge07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = new InvoiceDocument();
		doc.generate();

	}

}
