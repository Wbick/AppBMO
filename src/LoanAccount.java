
public class LoanAccount extends Account {

private double intrestRate;

public LoanAccount() {
    intrestRate = 5.00;
    
}

public loanaccount(double intrestrate){
    this.intrestrate = intrestrate;
}

public loanaccount(double intrestrate, double balance ){
    this.intrestrate = intrestrate;
    super(balance);


public applyInterest(){
     super.accountBalance = intrestRate * super.accountBalance;
}


}