public class AppBMO{

    private BmoClient user;

    public AppBMO(BmoClient user){
        this.user = user;
    }

    public AppBMO(){
        user = null;
    }

    // get and set for user

    public BmoClient getUser(){
        return user;
    }
    public void setUser(BmoClient user) {
        this.user = user;
    }

    public void addClient(String clientType, String clientAssociation, String sin, String email, String password, int ClientID){

        BmoClient newUser = new BmoClient(sin, password, email, clientType, clientAssociation, ClientID);
        if(newUser != null)
        user = newUser;
        else {
        System.err.println("Error in creating account");
        }
    
   
    }
    
    //attempting to log in
    public void login(String email, String password) {
        user.login(email, password);
    }

    public void viewBalance(int index) {
       System.out.println("Account Balance : $" + user.getAccount(index).getBalance());
    }

    public void viewAllAccounts(){
        user.listAccounts();
    }

    public void addAccount(String accountType, String accountNum) {
        user.addAccount(accountType, accountNum);
    }
    
    public void deleteAccount(int index) {
        user.removeAccount(index);
    }

    //print info on user
    public void listUser() {
        user.getDetails();
    }
}