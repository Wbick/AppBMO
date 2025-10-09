public class CheckingAccount extends Account {
    private String nickname;

    public CheckingAccount(String accNum){
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
         System.out.println("Account Details:\nAccount Number: "+getAccountNum()
        +"\nAccount Balence: "+getBalance()+"\nDate Opened: "+getAccountOpened() + "\nAccount Nickname: " + nickname);
    }
 
}