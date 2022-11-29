package com.encapsulation.iNeuron;

class ClassOne{
    private int classStrength;
    private int present;

    ClassOne()
    {
        this(60);
        System.out.println("Zero Parameterized Constructor");
        System.out.println("By Default \n Strength :: "+classStrength+" and Present Students are :: "+present);
    }

    ClassOne(int classStrength)
    {
        this(80,40);
        System.out.println("Constructor with one Parameter ==> classStrength ");
        System.out.println("1 Para Con \n Strength :: "+classStrength+" and Present Students are :: "+present);
    }

    ClassOne(int classStrength, int present)
    {
        this.classStrength=classStrength;
        this.present=present;
        System.out.println(" 2 Parameter Constructor");
        System.out.println("2 Para Con \n Strength :: "+classStrength+" and Present Students are :: "+present);
    }

    public int getPresent() {
        return present;
    }
    public int getClassStrength() {
        return classStrength;
    }

}


public class ConstructorChaining {
    public static void main(String[] args) {
        System.out.println("Application Started");
        ClassOne redHouse = new ClassOne();
        System.out.println("We have "+redHouse.getClassStrength()+" Students and "+redHouse.getPresent()+" are present now");

    }
}
