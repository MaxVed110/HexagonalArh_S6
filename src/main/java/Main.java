import Adapters.ConsolePrinter;
import Adapters.MovieReviewRepo;
import Adapters.UserCommand;
import Application.IFetchMovieReviews;
import Application.IPrintMovieReviews;
import Application.IUserInput;
import Application.MovieUser;
import Domen.MovieSearchRequest;

public class Main {
    public static void main(String[] args) {

        IFetchMovieReviews fetchMovieReviews = new MovieReviewRepo();
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();
        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);

        MovieUser movieUser = new MovieUser(userCommand);
        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);
        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);
    }
}
