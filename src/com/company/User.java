package com.company;

public class User {
   private int id;
   private String password;
   private String mobileNo;
   private double balance;

   User(int id,String password){
       this.id =id;
       this.password =password;
       balance = 500;

   }
   public int getId(){
       return this.id;
   }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public boolean verifyPassword(String password){
        return this.password .equals(password);
    }
    public void addBalance(double amount){
        this.balance += amount;
    }
    public void WithdrawBalance(double amount){
       this.balance -= amount;
    }
}

