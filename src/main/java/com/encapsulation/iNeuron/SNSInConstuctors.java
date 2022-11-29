package com.encapsulation.iNeuron;

class Vehicle
{
    static int count;
    int tyres;
    String brand;
    Vehicle()
    {
        System.out.println("We have Bicycle");
        count++;
    }
    Vehicle(int tyres)
    {
        this.tyres = tyres;
        System.out.println("We have Bike with "+tyres+" tyres");
        count++;
    }
    Vehicle(int tyres, String brand)
    {
        this.tyres = tyres;
        this.brand = brand;
        System.out.println("We have Car of "+brand+" brand with "+tyres+" tyres");
        count++;
    }
}

public class SNSInConstuctors {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(2);
        Vehicle v3 = new Vehicle(4,"Audi");
        System.out.println("We have basically "+v3.count+" Vehicles");

    }
}
