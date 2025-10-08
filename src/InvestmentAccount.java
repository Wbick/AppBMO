public class InvestmentAccount extends Account{
    private String nickname;
        
    public InvestmentAccount(int accNum){
        super(accNum);
        nickname = null;
    }

    public void setNickname(String s){
        nickname = s;
    }
    public String getNickname(){
        return nickname;
    }

}
