import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();
        char cont = 'y';

        while (cont == 'y' || cont == 'Y') {
            System.out.print("Enter the name of the movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the rating of the movie: ");
            double rating = scanner.nextDouble();

            System.out.print("Enter the number of tickets sold for this movie: ");
            int numTicketsSold = scanner.nextInt();
            movie.setNumTicketsSold(numTicketsSold);
            
            System.out.println("\nDo you want to enter another? (y/n)? ");
            cont = scanner.next().charAt(0);
        }
        scanner.close();
    }
}