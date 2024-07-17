public class FilmsRepository {
    private ListFilms[] films = new ListFilms[0];

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

}
