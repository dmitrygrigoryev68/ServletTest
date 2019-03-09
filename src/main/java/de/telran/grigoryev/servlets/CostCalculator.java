package de.telran.grigoryev.servlets;

public class CostCalculator {
    private double kgCost;
    private double kmCost;

    public CostCalculator(double kgCost, double kmCost){
        this.kgCost = kgCost;
        this.kmCost = kmCost;

    }

    public double calcCost (double weight, int km){
        return weight*2*km*1;

    }
}
