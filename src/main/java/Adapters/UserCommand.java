package Adapters;

import Application.IFetchMovieReviews;
import Application.IPrintMovieReviews;
import Application.IUserInput;
import Application.MovieApp;
import Domen.Model;
import Domen.MovieSearchRequest;

/**
 * Класс, отвечающий за команды пользователя
 */
public class UserCommand implements IUserInput {

    private Model model;

    /**
     * Объявлеение класса, его композиция с рабочим звеном программы и обработчиком запроса
     *
     * @param fetchMovieReviews извлечь обзор фильма
     * @param printMovieReviews напечатать извлеченный обзор
     */
    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    /**
     * Обработать команду пользователя
     *
     * @param userCommand команда пользователя
     */
    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest) userCommand);
    }
}
