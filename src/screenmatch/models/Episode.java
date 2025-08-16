package screenmatch.models;

import screenmatch.utils.Classificable;

public class Episode implements Classificable {
    private int number;
    private String nome;
    private Series series;
    private int notesSum;

    public Episode(int number, String nome, Series series) {
        this.number = number;
        this.nome = nome;
        this.series = series;
    }
    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public int getClassification() {
        return this.notesSum/5;
    }
}
