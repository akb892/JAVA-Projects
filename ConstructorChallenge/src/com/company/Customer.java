package com.company;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public Customer(String name, double creditLimit, String emailAddress) {
        System.out.println("Constructor with all parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer(){
        this("Gary", 20000, "garyme@gmail.com");
        System.out.println("Constructor with no parameters called");
    }
    public Customer(String name, String emailAddress){
        this(name, 5000, emailAddress);
        System.out.println("Constructor with 2 parameters called");
    }

}
