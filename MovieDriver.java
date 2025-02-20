import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to take this survey: ");
		String play = input.nextLine().toLowerCase();
		
		do {
			System.out.print("Enter the name of a movie: ");
			String movieName = input.nextLine();
			System.out.println(movieName);
//			System.out.print("Press Enter for next Question");
			input.nextLine();
			System.out.print("Enter the rating of a movie: ");
			String movieRating = input.nextLine();
			System.out.println(movieRating);
//			System.out.print("Press Enter for next Question");
			input.nextLine();
			System.out.print("Enter the number of tickets sold for this movie: ");
			String movieTickets = input.nextLine();
			System.out.println(movieTickets);
			input.nextLine();
			
			System.out.print("Do you want to take this survey: ");
			play = input.nextLine().toLowerCase();
			
			if (!play.contains("yes")) {
				System.out.println("GOODBYE!");
			}
		}while (play.contains("yes"));
	}

}
