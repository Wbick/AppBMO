import java.util.*;

public class Account {
    
    //account number
    protected String accountNum;
    //account balence
    protected double balance;
    //date account was opened
    protected Date accoutnOpened;


    //constructor
    public Account(int accNum){
        accNum = accNum;
        balance = 0.0;
        accoutnOpened = new Date();
    }

    //set and get
    public void setBalence(double b){
        balance = b;
    }
    public double getBalence(){
        return balance;
    }
    public String getAccountNum(){
        return accountNum;
    }
    public Date getAccountOpened(){
        return accoutnOpened;
    }

    //adds more money to balence
    public void deposit(double amount){
        setBalence(getBalence()+amount);
    }

    //removes money from balence
    public double withdraw(double amount){
        setBalence(getBalence()-amount);
        return getBalence();
    }

    public void getDetails(){
        System.out.println("Account Details:\nAccount Number: "+getAccountNum()
        +"\nAccount Balence: "+getBalence()+"\nDate Opened: "+getAccountOpened());
    }







}
