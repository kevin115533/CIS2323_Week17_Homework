package library;

public abstract class Book {
	String title = "";
	Double price = 0.0;
	public abstract void setPrice();
	
	public Book(){
		this.title = title;
		this.price = price;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String a){
		title = a;	
	}
	
	public double getPrice(){
		return price;
	}
}
