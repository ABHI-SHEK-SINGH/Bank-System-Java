package com.company;
import java.util.Scanner;
public class BankRunner {
/*login --> user,password
create account --> user id,password,amount;
send money from 1 account to another --> user id no,password,amount,destination account number
add balance --> user,password,amount
check balance--> user,password
withdraw money-->user,password,amount


 */


    public static void main(String[] args) {
        // write your code here
        Bank SBIBank = new Bank();
        System.out.println("Welcome to SBIBank");
        int option;

        do {
            System.out.println("Choose the option");
            System.out.println("1.Create an account");
            System.out.println("2.Transfer money to account ");
            System.out.println("3. Add money ");
            System.out.println("4. Check Balance ");
            System.out.println("5. Withdraw Money ");

            System.out.println("8.Exit");

            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
             int id,senderID,receiverID;
             boolean login;
            double amount ;
            String password;
            switch (option) {

                case 1:
                    System.out.println("Enter you new User id");
                     id = sc.nextInt();
                    System.out.println("Enter the new password");
                     password = sc.next();
                    SBIBank.addUser(id, password);
                    break;

                case 2:

                    System.out.println("Enter you  User id");
                    senderID = sc.nextInt();
                    System.out.println("Enter password");
                    password = sc.next();
                     login = SBIBank.VerifyCredentials(senderID,password);
                    if(login){

                        System.out.println("Enter receiver id");
                        receiverID = sc.nextInt();
                        System.out.println("Enter the amount to transfer ");
                        amount  = sc.nextDouble();
                        SBIBank.Send_Money(senderID,password,receiverID,amount);
                    }else{
                        System.out.println("Bad credentials");
                    }

                    break;
              case 3:

                    System.out.println("Enter you  User id");
                    id = sc.nextInt();
                    System.out.println("Enter password");
                    password = sc.next();
                    login = SBIBank.VerifyCredentials(id,password);
                    if(login){
                        System.out.println("Enter the amount to add");
                        amount = sc.nextDouble();
                        SBIBank.addMoney(id,amount);

                    }else{
                        System.out.println("Bad credentials");
                    }
                    break;
                case 4:
                    System.out.println("Enter you  User id");
                    id = sc.nextInt();
                    System.out.println("Enter password");
                    password = sc.next();
                    login = SBIBank.VerifyCredentials(id,password);
          if(login) {
              SBIBank.checkBalance(id);
          }else{
              System.out.println("Bad credentials");
          }
            break;
                case 5:
                    System.out.println("Enter you  User id");
                    id = sc.nextInt();
                    System.out.println("Enter password");
                    password = sc.next();
                    login = SBIBank.VerifyCredentials(id,password);
                    if(login) {
                        System.out.println("Enter the amount to be withdraw");
                        amount = sc.nextDouble();
                        SBIBank.withdrawMoney(id,amount);
                    }else {
                        System.out.println("Bad credentials");
                    }
                    break;

                case 8:
                    break;
                default:
                    break;
            }

        } while (option != 8);
        System.out.println("ThankYou for using our services");
    }
}
