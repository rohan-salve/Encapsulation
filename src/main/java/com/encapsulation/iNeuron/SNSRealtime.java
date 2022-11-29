package com.encapsulation.iNeuron;

class Student
{
    static int count;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int rollNumber,regNumber;
    String name;

    Student()
    {
        regNumber=++count;
    }
    Student(int rollNumber,String name)
    {
        this.rollNumber = rollNumber;
        this.name = name;
    }
    static void welcome()
    {
        System.out.println("Welcome to Student Registry");
    }
    void display()
    {
        System.out.println("Student Info is as follows");
    }
}

public class SNSRealtime {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rohan");
        s1.setRollNumber(22);
        s1.display();
        System.out.println("Reg Number  :: "+s1.getRegNumber());
        System.out.println("Roll Number :: "+s1.getRollNumber());
        System.out.println("Name        :: "+s1.getName());

        Student s2 = new Student();
        s2.setName("Shubham");
        s2.setRollNumber(9);
        s2.display();
        System.out.println("Reg Number  :: "+s2.getRegNumber());
        System.out.println("Roll Number :: "+s2.getRollNumber());
        System.out.println("Name        :: "+s2.getName());

        Student s3 = new Student();
        s3.setName("Sanket");
        s3.setRollNumber(56);
        s3.display();
        System.out.println("Reg Number  :: "+s3.getRegNumber());
        System.out.println("Roll Number :: "+s3.getRollNumber());
        System.out.println("Name        :: "+s3.getName());

    }
}
