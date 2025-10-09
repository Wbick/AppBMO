public class InvestmentAccount extends Account{
    private String nickname;
        
    public InvestmentAccount(String accNum){
        super(accNum);
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
    @Override
    public void getDetails(){
        System.out.println("Account Details:\nAccount Number: "+getAccountNum()+
        "\nAcount Nickname: "+getNickname()+
        "\nAccount Balence: "+getBalance()+
        "\nDate Opened: "+getAccountOpened());
    }
}
