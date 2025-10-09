import java.util.*;

public  class Account {
    
    //account number
    protected String accountNum;
    //account balence
    protected double balance;
    //date account was opened
    protected Date accountOpened;


    //constructor
    public Account(String accNum){
        accountNum = accNum;
        balance = 0.0;
        accountOpened = new Date();
    }
    
   public Account(String accNum, double balance){
        accountNum = accNum;
        this.balance = balance;
        accountOpened = new Date();
    }
    //set and get
    public void setBalance(double b){
        balance = b;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountNum(){
        return accountNum;
    }
    public Date getAccountOpened(){
        return accountOpened;
    }
    public  void setNickname(String name) {
    }
    public  String getNickname(){
        return null;
    }
    public  void applyInterest(){
    }


    //adds more money to balence
    public void deposit(double amount){
        setBalance(getBalance()+amount);
    }

    //removes money from balence
    public double withdraw(double amount){
        setBalance(getBalance()-amount);
        return getBalance();
    }

    public void getDetails(){
        System.out.println("Account Details:\nAccount Number: "+getAccountNum()
        +"\nAccount Balence: "+getBalance()+"\nDate Opened: "+getAccountOpened());
    }







}
