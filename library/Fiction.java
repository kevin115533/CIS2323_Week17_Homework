package library;

public class Fiction extends Book {
	
	public Fiction(String a){
		setTitle(a);
		setPrice();
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setPrice(){
		price = 24.99;
	}
	
	public void printBook(){
		System.out.println("Fiction Title: " + getTitle() +
						   " Price: " + getPrice());
	}
}
