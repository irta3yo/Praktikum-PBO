package PolimorfismeInclusion;

public class Vehicle{
    public void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle price = " + fare);
    }
}