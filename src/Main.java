import screenmatch.models.Movie;

import java.util.Scanner;
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Movie myMovie = new Movie("Castelo Infinito",2025,true,125,"Lazaro");
        myMovie.imprimeFicha();
        myMovie.addNote(8);
        myMovie.addNote(10);
        myMovie.addNote(2);
        System.out.println(myMovie.getMean());;
    }

}