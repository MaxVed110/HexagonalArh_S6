package Adapters;

import Application.IPrintMovieReviews;
import Domen.MovieReview;

import java.util.List;

/**
 * Класс консольного вывода
 */
public class ConsolePrinter implements IPrintMovieReviews {

    /**
     * Вывести информацию в консоль
     *
     * @param movieReviewList список обзоров фильма
     */
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
