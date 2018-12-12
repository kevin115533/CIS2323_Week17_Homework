import library.*;

public class UseBook{
	public static void main (String args[]){
		
		Fiction book1 = new Fiction("The Road");
		NonFiction book2 = new NonFiction("Sapiens: A Brief History of Humankind");
		
		System.out.println("My favorite fiction book is called " + book1.getTitle() + 
						  ", you can purchase this book for " + book1.getPrice() );
		
		System.out.println("My favorite nonfiction book is called " + book2.getTitle() + 
						  ", you can purchase this book for " + book2.getPrice() );
	}
}
