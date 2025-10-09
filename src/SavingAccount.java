public class SavingAccount extends Account{
    private String nickname;
    private double interest;
        
    public SavingAccount(String accNum){
        super(accNum);
        interest = 0;
        nickname = null;
    }

    @Override
    public void setNickname(String s){
        nickname = s;
    }

    @Override
    public String getNickname(){
        return nickname;
    }
    public void setInterest(double i) {
        interest = i;
    }
    public double getInterest(){
        return interest;
    }
    @Override
    public void applyInterest(){
        super.setBalance(interest * super.getBalance());

    }

    @Override
    public void getDetails(){
        System.out.println("Account Details:\nAccount Number: "+getAccountNum()+
        "\nAcount Nickname: "+getNickname()+
        "\nAccount Balence: "+getBalance()+
        "\nIntrest Rate: "+getInterest()+
        "\nDate Opened: "+getAccountOpened());
    }
}
