import screenmatch.models.Movie;
import screenmatch.utils.recomendationsFilter;
import  screenmatch.utils.timeCalculator;


import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private  static timeCalculator calculator = new timeCalculator();
    private static recomendationsFilter filter = new recomendationsFilter();
    public static void main(String[] args){
        Movie myMovie = new Movie("Castelo Infinito",2025,true,125,"Lazaro");
        Movie amandaMovie = new Movie("O Castelo Animado",1985,true,130,"Myazaki");
        Movie crisMovie = new Movie("Django Livre",2008,false,145,"Tarantino");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(myMovie);
        movies.add(amandaMovie);
        movies.add(crisMovie);
        System.out.println(movies);

    }

}