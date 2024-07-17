public class FilmManager {
    private FilmsRepository repo;
    private int resultLength;

    public FilmManager(FilmsRepository reposit) {
        this.repo = reposit;
        this.resultLength = 5;
    }

    public FilmManager(FilmsRepository reposit, int resultLengthMax) {
        this.repo = reposit;
        this.resultLength = resultLengthMax;
    }

    public int getResultLength() {
        return resultLength;
    }

    public void setResultLength(int resultLengthMax) {
        this.resultLength = resultLengthMax;
    }

    public void add(ListFilms film) {
        repo.save(film);

    }

    public ListFilms[] findLast() {
        ListFilms[] all = repo.getFilms();
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
        ListFilms[] allFilms = repo.getFilms();
        return allFilms;
    }
}
