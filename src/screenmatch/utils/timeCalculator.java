package screenmatch.utils;
import screenmatch.models.Titles;

public class timeCalculator {
    private int totalTimer;

    public int getTotalTimer(){
        return  totalTimer;
    }

    public void  addTitle(Titles title){
        totalTimer += title.getDuration();
    }
}

