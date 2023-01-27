package Application;

import Domen.MovieReview;
import Domen.MovieSearchRequest;

import java.util.List;

/**
 * Интерфейс взаимодействия с базой обзоров
 */
public interface IFetchMovieReviews {

    /**
     * Извлечь существующие обзоры на фильм
     *
     * @param movieSearchRequest результат поиска фильма
     * @return
     */
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
