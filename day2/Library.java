package myAssignments.day2;

public class Library {
	
	public static String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public static void issueBook() {
		
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library book=new Library();
		book.addBook("maths");
		book.issueBook();

	}

}
