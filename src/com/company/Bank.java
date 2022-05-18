package com.company;

import java.util.HashMap;

public class Bank {
    private HashMap<Integer,User> Users;
    Bank(){
        Users = new HashMap<Integer,User>();
            }

    public void addUser(int id,String password) {
        if(Users.containsKey(id)){
            System.out.println("User id already exists");

        }else{
            User newUser = new User(id,password);
            Users.put(id,newUser);
            System.out.println("Account successfully created");
        }
    }
    public void Send_Money(int id,String password,int destID,double amount) {
        User sender = Users.get(id);

            if (sender.getBalance()>=amount) {
                System.out.println("Transferring money");
               User receiver = Users.get(destID);
               if(receiver==null){
                   System.out.println("Receiver id not found");
                   return;
               }
               sender.setBalance(sender.getBalance() - amount);
               receiver.setBalance(receiver.getBalance() + amount);

               System.out.println("Transferred money successfully");
                System.out.println("Your new balance is "+ sender.getBalance());
            }else{
                System.out.println("Insufficient balance");
        }
            return;
    }


            public boolean VerifyCredentials(int id,String password){
           User user = Users.get(id);
           if(user == null)
               return false;
           return user.verifyPassword(password);

            }
            public void addMoney(int id,double amount){
                User user = Users.get(id);
                user.addBalance(amount);
                System.out.println("Succesfully added Money !!!\n Your new balance is "+ user.getBalance());

            }
    public void checkBalance(int id){
        User user = Users.get(id);
        System.out.println("Your balance is :"+user.getBalance());


    }
      public void withdrawMoney(int id,double amount){
          User user = Users.get(id);
          user.WithdrawBalance(amount);
          System.out.println("Your remaining  balance is :"+user.getBalance());
      }

}
