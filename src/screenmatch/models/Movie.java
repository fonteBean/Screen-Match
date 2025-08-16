package screenmatch.models;

public class Movie extends Titles{
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    private String director;

    public Movie(String name, int year, boolean included, int duration, String director) {
        super(name,year,included,duration);
        this.director = director;
    }

    @Override
    public void setDuration() {

    }
}
