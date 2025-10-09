import java.util.ArrayList;

public class BmoClient extends Client{

    private int points;
    private String sin;
    private String password;
    private String email;
    private ArrayList<Account> accounts;
    private boolean loggedIn;

    //constructor
    public BmoClient(String sin, String password, String email, String clientType, String clientAssociation, int clientId){
        super(clientType,clientAssociation,clientId);
        points = 0;
        this.sin = sin;
        this.password = password;
        this.email = email;
        accounts = new ArrayList<Account>();
        boolean loggedIn = false;
        
    }

    //set and get methods

    public int getPoints(){
        if(loggedIn)
        return points;
        return -1;
    }
    public void setPoints(int points){
        if(loggedIn)
        this.points = points;
    }

    public String getSin(){
        if(loggedIn)
        return sin;
        return null;
    }

    public void setSin(String sin){
        if(loggedIn)
        this.sin = sin;
    }
    
    public String getPassword(){
        if(loggedIn)
        return password;
        return null;
    }
    public void setPassword(String password){
        if(loggedIn)
        this.password = password;
    }
    
    public String getEmail(){
        if(loggedIn)
        return email;
        return null;
    }
    public void setEmail(String email){
        if(loggedIn)
        this.email = email;
    }

    public ArrayList<Account> getAccounts(){
        if(loggedIn)
        return accounts;
        return null;
    }

      public void setAccounts(ArrayList<Account> accounts){
        if(loggedIn)
        this.accounts = accounts;
    }

    public boolean getLoggedIn(){
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn){
        this.loggedIn = loggedIn;
    }

    //add and remove Accounts

    public void addAccount(String accountType, String accountNum){
        switch(accountType) {
            
            case "InvestmentAccount":
            accounts.add(new InvestmentAccount(accountNum));
            break;
            case "CheckingAccount":
            accounts.add(new CheckingAccount(accountNum));
            break;
            case "SavingAccount":
            accounts.add(new SavingAccount(accountNum));
            break;
            case "LoanAccount":
            accounts.add(new LoanAccount(accountNum));
        }
    }

    public Account removeAccount(int index){
        return accounts.remove(index);
    }
    //other methods
    public boolean subtractPoints(int pointsRemove){

        if(points -pointsRemove > 0){
            points -= pointsRemove;
            return true;
        }
        return false;
    }

    public boolean login(String email, String password) {
        if(email.equals(this.email) && password.equals(this.password))
            loggedIn = true;
            else {
                System.err.println("Wrong email or password");
            }
        return loggedIn;
    }

    public Account getAccount(int index){
        if(loggedIn)
        return accounts.get(index);
        return null;
    }

    //list all accounts
    public void listAccounts(){
        for(int i = 0; i < accounts.size(); i++){
            System.out.println("\nAccount "+i);
            accounts.get(i).getDetails();
        }
    }

    public void getDetails(){
        System.out.println("ID: " + super.getClientId());
        System.out.println("ClientType: "+ super.getClientType());
        System.out.println("Client Association" + super.getClientAssociation());
        System.out.println("Points:" + points);
        System.out.println("Sin:" + sin);
        System.out.println("Email:" + email);
        System.out.println("logged In:" + loggedIn);
        listAccounts();

    }
}
