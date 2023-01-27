package Domen;

/**
 * Класс получения названия фильма из запроса
 */

public class MovieSearchRequest {
    String request;

    /**
     * Присвоить значение
     *
     * @param name название фильма
     */
    public MovieSearchRequest(String name) {
        this.request = name;
    }

    /**
     * Получить название фильма
     *
     * @return название фильма
     */
    public String getMovieName() {
        return request;
    }
}
