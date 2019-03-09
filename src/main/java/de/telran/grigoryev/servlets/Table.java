package de.telran.grigoryev.servlets;

public class Table implements Box {
    private int countOflegs;
    private double weight;

    public Table(int countOflegs, double weight){
        this.countOflegs = countOflegs;
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
}
