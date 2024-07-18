import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmManager manager = new FilmManager();
    ListFilms film1 = new ListFilms(11, "Бладшот", "Боевик");
    ListFilms film2 = new ListFilms(22, "Вперед", "Мультфильм");
    ListFilms film3 = new ListFilms(10, "Отель", "Комедия");
    ListFilms film4 = new ListFilms(15, "Джентельмены", "Боевик");
    ListFilms film5 = new ListFilms(28, "Неведимка", "Ужасы");
    ListFilms film6 = new ListFilms(34, "Троли", "Мультфильм");
    ListFilms film7 = new ListFilms(48, "Номер один", "Комедия");

    @BeforeEach
    public void setup() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
    }

    @Test
    public void addTest() {
        ListFilms film8 = new ListFilms(56, "Номер два", "Ужасы");
        manager.add(film8);
        ListFilms[] expected = {film1, film2, film3, film4, film5, film6, film7, film8};
        ListFilms[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTest() {

        ListFilms[] expected = {film1, film2, film3, film4, film5, film6, film7};
        ListFilms[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {

        ListFilms[] expected = {film7, film6, film5, film4, film3};
        ListFilms[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMinTest() {
        FilmManager manager2 = new FilmManager(3);

        manager2.add(film1);
        manager2.add(film2);
        manager2.add(film3);
        manager2.add(film4);
        manager2.add(film5);
        manager2.add(film6);
        manager2.add(film7);

        manager2.setResultLength(3);
        ListFilms[] expected = {film7, film6, film5};
        ListFilms[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMaxTest() {
        FilmManager manager2 = new FilmManager(8);

        manager2.add(film1);
        manager2.add(film2);
        manager2.add(film3);
        manager2.add(film4);
        manager2.add(film5);
        manager2.add(film6);
        manager2.add(film7);

        ListFilms[] expected = {film7, film6, film5, film4, film3, film2, film1};
        ListFilms[] actual = manager2.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test() {
        manager.removeById(film2.getId());

        ListFilms[] expected = {film1, film3, film4, film5, film6, film7};
        ListFilms[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
