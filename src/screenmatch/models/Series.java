package screenmatch.models;

public class Series extends Titles {
    private int temps;
    private int episodesPerTemp;
    private int episodesDuration;
    private  boolean onGoing;


    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public int getEpisodesPerTemp() {
        return episodesPerTemp;
    }

    public void setEpisodesPerTemp(int episodesPerTemp) {
        this.episodesPerTemp = episodesPerTemp;
    }

    public int getEpisodesDuration() {
        return episodesDuration;
    }

    public void setEpisodesDuration(int episodesDuration) {
        this.episodesDuration = episodesDuration;
    }

    public boolean isOnGoing() {
        return onGoing;
    }

    public void setOnGoing(boolean onGoing) {
        this.onGoing = onGoing;
    }

    @Override
    public int getDuration(){
        return (episodesPerTemp * episodesDuration * temps);
    }



    public Series(String name, int year, boolean included, int temps, int episodesPerTemp, int episodesDuration,  boolean onGoing) {
        super(name, year, included, (episodesPerTemp * episodesDuration * temps));
        this.temps = temps;
        this.episodesPerTemp =episodesPerTemp;
        this.episodesDuration = episodesDuration;
        this.onGoing = onGoing;;

    }

}
