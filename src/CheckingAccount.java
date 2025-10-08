public class CheckingAccount extends Account {
    private String nickname;

    public CheckingAccount(int accNum){
        super(accNum);
        nickname = null;
    }

    public void setNickname(String s){
        nickname = s;
    }
    public String getNickname(){
        return nickname;
    }

    public void getDetails(){
         System.out.println("Account Details:\nAccount Number: "+getAccountNum()
        +"\nAccount Balence: "+getBalence()+"\nDate Opened: "+getAccountOpened() + "\nAccount Nickname: " + nickname);
    }
 
}