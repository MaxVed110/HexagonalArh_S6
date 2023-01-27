package Application;

import Domen.MovieReview;

import java.util.List;

/**
 * Интерфейс печати обзоров
 */
public interface IPrintMovieReviews {

    /**
     * Вывести обзор в...
     *
     * @param movieReviewList список обзоров фильма
     */
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
