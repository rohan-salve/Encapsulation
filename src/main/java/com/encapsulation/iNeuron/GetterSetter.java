package com.encapsulation.iNeuron;

import java.util.Scanner;

class Credentials{
    private int id;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    private int password;

    public void setId(int givenId)
    {
        this.id = givenId;
    }

    public int getId()
    {
        return id;
    }
}

public class GetterSetter {

    public static void main(String[] args) {
        System.out.println("Enter Credentials");
        Scanner sc = new Scanner(System.in);

        Credentials cred = new Credentials();

        System.out.println("Enter ID :: ");
        cred.setId(sc.nextInt());
        System.out.println("Enter Password :: ");
        cred.setPassword(sc.nextInt());
        System.out.println(cred.getId());
        System.out.println(cred.getPassword());

    }
}

