package library;

public class NonFiction extends Book {
	
	public NonFiction(String a){
		setTitle(a);
		setPrice();
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setPrice(){
		price = 37.99;
	}
}
