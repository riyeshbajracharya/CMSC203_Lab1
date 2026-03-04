package Task2;
import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		String option;
		
		do 
		{
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
	        
	        System.out.println("Do you want to enter another? (y or n) ");
	        option = input.nextLine();
		
		}while (option.equalsIgnoreCase("y"));
		
        input.close();
        
	}

}
