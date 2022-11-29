package com.encapsulation.iNeuron;

class OneClass{
    public static void display1(){
        System.out.println("Static Display Method");
    }
    void display2(){
        System.out.println("Non Static Display Method");
    }
}
public class SNSDiffClass {
    public static void main(String[] args) {
        OneClass.display1();

        OneClass obj = new OneClass();
        obj.display2();
        obj.display1();
    }

}
