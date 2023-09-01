package com.company;

public class Bank {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phonenumber;

    public Bank() {
        this("56789", 2.50, "Default Name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }
    public Bank(String accountNumber, double accountBalance, String customerName, String email, String phonenumber) {
        System.out.println("Bank constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public Bank(String customerName, String email, String phonenumber) {
        this("99999", 100.55, customerName, email, phonenumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phonenumber = phonenumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + accountBalance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if(accountBalance - withdrawAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account.");
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawl of $" + withdrawAmount + " processed, Remaining balance = $" + accountBalance);
        }
    }

}
