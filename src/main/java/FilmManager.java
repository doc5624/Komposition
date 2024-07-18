public class FilmManager {
    private int resultLength;
    private ListFilms[] films = new ListFilms[0];

    public FilmManager() {
        this.resultLength = 5;
    }

    public FilmManager(int resultLengthMax) {
        this.resultLength = resultLengthMax;
    }

    public void save(ListFilms film) {
        ListFilms[] tmp = new ListFilms[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public void removeById(int id) {
        ListFilms[] tmp = new ListFilms[films.length - 1];
        int copyToIndex = 0;
        for (ListFilms film : films) {
            if (film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public ListFilms[] getFilms() {
        return films;
    }

    public int getResultLength() {
        return resultLength;
    }

    public void setResultLength(int resultLengthMax) {
        this.resultLength = resultLengthMax;
    }

    public void add(ListFilms film) {
        save(film);
    }

    public ListFilms[] findLast() {
        ListFilms[] all = getFilms();
        int resultLengthMax = getResultLength();
        int lengthArray = all.length;
        int lengthArrayReversed;

        if (lengthArray > resultLengthMax) {
            lengthArrayReversed = resultLengthMax;
        } else {
            lengthArrayReversed = lengthArray;
        }

        ListFilms[] reversed = new ListFilms[lengthArrayReversed];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public ListFilms[] findAll() {
        ListFilms[] allFilms = getFilms();
        return allFilms;
    }
}
