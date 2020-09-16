import java.util.Scanner;
public class MovieDriver 
{

	public static void main(String[] args)
	{
		String title;
	    String rating,
	          choice;
	    int soldTickets;
	        
	    
		Scanner keyboard = new Scanner(System.in);
		MovieDriver input = new MovieDriver();
		 
		
		System.out.println("Enter the title of a movie: ");
		title = keyboard.nextLine();
		
		System.out.println("Enter the rating of the movie: ");
		rating = keyboard.nextLine();
		rating = MovieDriver();
		
		System.out.println("Enter the number of tickets sold for this movie: ");
		soldTickets = keyboard.nextInt();
		
		System.out.print("Do you want ot enter another (yes or no): ");
		keyboard.nextLine();
		choice = keyboard.nextLine();
		
		while(choice.equals("yes"));
		{
			System.out.println("Enter the title of a movie: ");
			title = keyboard.nextLine();
			
			System.out.println("Enter the rating of the movie: ");
			rating = keyboard.nextLine();
			
			System.out.println("Enter the number of tickets sold for this movie: ");
			soldTickets = keyboard.nextInt();
			
			System.out.print("Do you want ot enter another (yes or no): ");
			keyboard.nextLine();
			choice = keyboard.nextLine();
		}
		
		System.out.print("Goodbye");
		
        keyboard.close();
	}

	private static String MovieDriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
