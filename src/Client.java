public class Client {

    // Attributes
    private String clientType;
    private String clientAssociation;
    private Integer clientId;

    // Default constructor
    public Client() {
        // values remain null until set
    }

    // Parameterized constructor
    public Client(String clientType, String clientAssociation, Integer clientId) {
        this.clientType = clientType;
        this.clientAssociation = clientAssociation;
        this.clientId = clientId;
    }

    // Setter methods
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public void setClientAssociation(String clientAssociation) {
        this.clientAssociation = clientAssociation;
    }

    public void setClientId(Integer newID) {
        this.clientId = newID;
    }

    // Getter methods
    public String getClientType() {
        return clientType;
    }

    public String getClientAssociation() {
        return clientAssociation;
    }

    public Integer getClientId() {
        return clientId;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 9b6f26c25dc00416c4a59f0ec2632357c303eb77
