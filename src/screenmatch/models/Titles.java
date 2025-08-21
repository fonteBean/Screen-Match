package screenmatch.models;

import screenmatch.utils.Classificable;

public class Titles implements Comparable<Titles> {
    private String name;
    private int year;
    private boolean included;
    private double reviewsSum;
    private int numberOfReviews;
    private int duration;;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Titles(String name, int year, boolean included, int duration) {
        this.name = name;
        this.year = year;
        this.included = included;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return  "Name: " + getName() + " Ano: " +  getYear();
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public double getReviewsSum() {
        return reviewsSum;
    }

    public void setReviewsSum(double reviewsSum) {
        this.reviewsSum = reviewsSum;
    }

    public boolean isIncluded() {
        return included;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }


    public void printTitle(){
        System.out.println("--------"+this.name+"-----------");
        System.out.println("Year: " + this.year);
        System.out.println("Duration: " + this.duration);

    }

    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void setDuration(int duration){
        this.duration = duration;
        ;;  }

    public int getDuration(){
        return this.duration;
    }


    public void addNote(double note){
        this.reviewsSum += note;
        this.numberOfReviews++;;
    }
    public double getMean(){
        return reviewsSum/numberOfReviews;
    }

    @Override
    public int compareTo(Titles otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
