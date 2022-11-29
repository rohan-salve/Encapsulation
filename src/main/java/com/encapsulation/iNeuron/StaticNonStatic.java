package com.encapsulation.iNeuron;

public class StaticNonStatic {
    static int a,b,c;

    static {
        System.out.println("Static Block Executed and Static Variables Initialized here");
        a=10; b=20; c=30;
    }
    static void display()
    {
        System.out.println("a="+a+" b ="+b+" c="+c);
    }

    int x,y,z;
    {
        System.out.println("Non Static Block Executed and Non Static variables Initialized here");
        x=40;y=50;z=60;
    }
    void display2()
    {

        System.out.println("x="+x+" y="+y+" z="+z);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
       display();
       new StaticNonStatic().display2();

    }
}
