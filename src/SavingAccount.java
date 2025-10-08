public class SavingAccount extends Account{
    private String nickname;
    private double interest;
        
    public SavingAccount(int accNum){
        super(accNum);
        interest = 0;
        nickname = null;
    }

    public void setNickname(String s){
        nickname = s;
    }
    public String getNickname(){
        return nickname;
    }
    public void setInterest(double i) {
        interest = i;
    }
    public double getInterest(){
        return interest;
    }

    public void getDetails(){
        System.out.println("Account Details:\nAccount Number: "+getAccountNum()+
        "\nAcount Nickname: "+getNickname()+
        "\nAccount Balence: "+getBalence()+
        "\nDate Opened: "+getAccountOpened());
    }
}
