package lab05;

public class Exercise03 {
	static class Book{
		String title;
		String author;
		double price;
		
		Book(){
			title = "unknown";
			author = "unknown";
			price = 0;
		}
		Book(String title, String author, double price){
			this.title = title;
			this.author = author;
			this.price = price;
		}
		void display() {
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("Price: " + price);

		}
		
	}
	
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Java Programming","Kevin",27.99);
		
		System.out.println("Book1 detial: ");
		book1.display();
		
		System.out.println("\nBook2 detial: ");
		book2.display();
		
	}
}
