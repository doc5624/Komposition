public class ListFilms {
    private int id;
    private String name;
    private String genre;

    public ListFilms(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre() {
        this.genre = genre;
    }
}
