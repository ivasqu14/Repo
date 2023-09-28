import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie m1 = new Movie();
		boolean flag = true;
		do
		{
			String answer;
			System.out.println("Enter the name of a movie ");
			m1.setTitle(input.nextLine());
			System.out.println("Enter the rating of the movie ");
			m1.setRating(input.nextLine());
			System.out.println("Enter the number of tickets sold for this movie ");
			m1.setSoldTickets(input.nextInt());
			input.nextLine();
			System.out.println(m1);
			System.out.println("Do you want to enter another? (y / n)");
			answer = input.nextLine();
			if(answer.equalsIgnoreCase("n"))
			{
				flag = false;
			}
			
		}while(flag);
		
		System.out.println("Goodbye");
		
		input.close();
	}

}
