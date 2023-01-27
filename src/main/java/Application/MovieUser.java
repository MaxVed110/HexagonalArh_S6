package Application;

import Domen.MovieSearchRequest;

/**
 * Класс ввода информации пользователя (пользовательский драйвер)
 */
public class MovieUser {

    private IUserInput userInputDriverPort;

    public MovieUser(IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    /**
     * Передать пользователью результат его запроса
     *
     * @param movieSearchRequest запрос пользователя - название фильма
     */
    public void processInput(MovieSearchRequest movieSearchRequest) {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
