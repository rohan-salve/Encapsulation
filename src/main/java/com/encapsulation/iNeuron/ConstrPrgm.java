package com.encapsulation.iNeuron;
class MyCreds{

    private String userName;
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address; /*this keyword is required since we are referring to runtime object
                                    variabe and we have same variable at LHS and RHS*/
    }

    MyCreds()
    {
        userName = "ROOT";//this keyword not required because we don't have same variable at RHS
        address = "ROOT";
    }

    MyCreds(String givenUserName, String givenAddress)
    {
        this.userName = givenUserName;
        this.address = givenAddress;
    }
}
public class ConstrPrgm {

    public static void main(String[] args) {
        System.out.println("Welcome to Enterprises");

        MyCreds customer1 = new MyCreds("Rohan", "Pune");
        System.out.println("User Name :: "+customer1.getUserName());
        System.out.println("Address :: "+customer1.getAddress());

        MyCreds customer2 = new MyCreds();
        System.out.println("Default User Name :: "+customer2.getUserName());
        System.out.println("Default Address :: "+customer2.getAddress());

    }
}
