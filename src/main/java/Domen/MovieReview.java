package Domen;

/**
 * Класс, содержащий информацию об обзоре фильма
 */
public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    /**
     * Создает экземпляр класса - обзор
     *
     * @param s         название фильма
     * @param v         рейтинг
     * @param excellent краткий итог
     */
    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }

    /**
     * Преобразовать в строковый тип
     *
     * @return обзор
     */
    @Override
    public String toString() {
        return " " + movieScore + " " + remark;
    }

}
