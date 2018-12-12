import library.*;

public class BookArray{
	public static void main (String args[]){
		final int count = 10;
		
		Fiction[] book = new Fiction[count];
		NonFiction[] book2 = new NonFiction[count];
		
		book[0] = new Fiction("The Road");
		book[1] = new Fiction("Scorpion House");
		book[2] = new Fiction("Enders Game");
		book[3] = new Fiction("Gone With The Wind");
		book[4] = new Fiction("50 Shades of Gray");
		book[5] = new Fiction("Lord Of The Rings");
		book2[6] = new NonFiction("In Cold Blood");
		book2[7] = new NonFiction("Silent Spring");
		book2[8] = new NonFiction("I'll Be Gone In The Dark");
		book2[9] = new NonFiction("Homage to Catalonia");
		
		
		for(int i =0; i<10; i++){
			if(i<6){
				book[i].printBook();
			}
			else{
				book2[i].printBook();	
			}
		}
		
		
	}
}