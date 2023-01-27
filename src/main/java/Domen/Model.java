package Domen;

import Application.MovieApp;

/**
 * Класс обработки запроса пользователя
 */
public class Model {
    private MovieApp movieApp;

    /**
     * @param movieApp связь программы - обработчик
     */
    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    /**
     * Старт обработки запроса (получение информации о заданном фильме)
     *
     * @param movieSearchRequest результат поисткового запроса - название фильма
     */
    public void Run(MovieSearchRequest movieSearchRequest) {
        movieApp.accept(movieSearchRequest);
    }
}
