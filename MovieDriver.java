package Task1;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Movie movie = new Movie();
			
		System.out.println("Enter the name of a movie");
		String title = input.nextLine();
		movie.setTitle(title);
			
		System.out.print("Enter the rating of the movie\n");
		String rating = input.nextLine();
		movie.setRating(rating);
		    
		System.out.print("Enter the number of tickets sold for this movie\n");
	    int tickets = input.nextInt();
	    movie.setSoldTickets(tickets);
			
	    input.nextLine();
	        
	    System.out.println(movie.toString());
		
        input.close();
        
	}

}
