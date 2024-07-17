import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsRepositoryTest {

    ListFilms film1 = new ListFilms(11, "Бладшот", "Боевик");
    ListFilms film2 = new ListFilms(22, "Вперед", "Мультфильм");
    ListFilms film3 = new ListFilms(10, "Отель", "Комедия");
    ListFilms film4 = new ListFilms(15, "Джентельмены", "Боевик");
    ListFilms film5 = new ListFilms(28, "Неведимка", "Ужасы");
    ListFilms film6 = new ListFilms(34, "Троли", "Мультфильм");
    ListFilms film7 = new ListFilms(48, "Номер один", "Комедия");

    @Test
    public void test() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.removeById(film2.getId());

        ListFilms[] expected = {film1, film3, film4, film5, film6, film7};
        ListFilms[] actual = repo.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}

