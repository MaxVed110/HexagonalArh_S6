package Adapters;

import Application.IFetchMovieReviews;
import Domen.MovieReview;
import Domen.MovieSearchRequest;

import java.util.*;

/**
 * Класс-репозиторий, база обзоров с получением нужного
 */
public class MovieReviewRepo implements IFetchMovieReviews {

    private Map<String, List<MovieReview>> movieReviewMap;

    public MovieReviewRepo() {
        initialize();
    }

    /**
     * Извлекает нужный обзор из базы
     *
     * @param movieSearchRequest результат поиска фильма
     * @return
     */
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    /**
     * Аппаратная инициализация базы обзоров
     */
    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }
}
