import screenmatch.models.Movie;
import screenmatch.models.Series;
import screenmatch.models.Titles;
import screenmatch.utils.recomendationsFilter;
import  screenmatch.utils.timeCalculator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private  static timeCalculator calculator = new timeCalculator();
    private static recomendationsFilter filter = new recomendationsFilter();
    public static void main(String[] args){
        Movie myMovie = new Movie("Castelo Infinito",2025,true,125,"Lazaro");
        Movie amandaMovie = new Movie("O Castelo Animado",1985,true,130,"Myazaki");
        Movie crisMovie = new Movie("Django Livre",2008,false,145,"Tarantino");
        ArrayList<Titles> list = new ArrayList<>();
        list.add(myMovie);
        list.add(amandaMovie);
        list.add(crisMovie);
        Series got = new Series("Game of Throne", 2005, true, 7,5,60,false);
        list.add(got);
        for (Titles item:list){
            if (item instanceof  Movie movie )
                System.out.println(item.toString() + " Classificação: " + movie.getClassification());
        }
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Titles::getYear));
        System.out.println(list);


    }

}