
public class LoanAccount extends Account {

    private double intrestRate;

    public LoanAccount(String accountNum) {
        super(accountNum);
        intrestRate = 5.00;

    }

    public LoanAccount(double intrestRate, String accountNum) {
        super(accountNum);
        this.intrestRate = intrestRate;
    }

    public void setInterest(double i) {
        intrestRate = i;
    }

    public double getInterest() {
        return intrestRate;
    }

    @Override
    public void applyInterest() {
        super.setBalance(intrestRate * super.getBalance());
    }

    @Override
    public void getDetails(){
        System.out.println("Account Details:\nAccount Number: "+getAccountNum()+
        "\nAccount Balence: "+getBalance()+
        "\nIntrest Rate: "+ getInterest()+
        "\nDate Opened: "+getAccountOpened());
    }

}