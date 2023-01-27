package Application;

import Domen.MovieReview;
import Domen.MovieSearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс обработки внутренних данных программы
 */
public class MovieApp {

    private IFetchMovieReviews fetchMovieReviews;
    private IPrintMovieReviews printMovieReviews;
    private static Random rand = new Random();

    /**
     * @param fetchMovieReviews
     * @param printMovieReviews
     */
    public MovieApp(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }

    /**
     * Получить рандомный обзор
     *
     * @param movieReviewList списое обзоров
     * @return
     */
    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList<MovieReview>();
        // logic to return random reviews
        for (int index = 0; index < 5; ++index) {
            if (movieReviewList.size() < 1)
                break;
            int randomIndex = getRandomElement(movieReviewList.size());
            MovieReview movieReview = movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }
        return result;
    }

    private int getRandomElement(int size) {
        return rand.nextInt(size);
    }

    /**
     * Внутренняя связь программы, получение и печать рандомного обзора о фильме
     *
     * @param movieSearchRequest результат запроса - название фильма
     */
    public void accept(MovieSearchRequest movieSearchRequest) {
        List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest);
        List<MovieReview> randomReviews = filterRandomReviews(new ArrayList<>(movieReviewList));
        printMovieReviews.writeMovieReviews(randomReviews);
    }

}
