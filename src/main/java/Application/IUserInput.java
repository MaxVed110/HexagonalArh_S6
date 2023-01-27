package Application;

/**
 * Интерфейс для получения информации от пользователь
 */
public interface IUserInput {

    /**
     * Метод обработки пользовательской команды
     *
     * @param userCommand команда пользователя
     */
    public void handleUserInput(Object userCommand);
}
