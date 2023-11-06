public class Keeper {
    private String keeperID;        //declares ID string
    private String firstName;       //declares first name string
    private String surname;         //declares surname string
    private String address;         //declares address string
    private String contactNumber;   //declares contact number string
    private String position;        //declares position string
    private String cageAllocated;   //declares cage allocated string

    public Keeper(String keeperID, String firstName, String surname, String address, String contactNumber, String position){ //keeper class constructor
        this.keeperID = keeperID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.contactNumber = contactNumber;
        this.position = position;

    }

    public String getKeeperID() {
        return keeperID;
    }  //method to get the keeper ID

    public void setKeeperID(String keeperID) {
        this.keeperID = keeperID;
    } // method to set the keeper ID

    public String getFirstName() {
        return firstName;
    }     // method to get the keeper First Name

    public void setFirstName(String firstName) {        // method to set the keeper First Name
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }   // method to get the keeper Surname

    public void setSurname(String surname) {
        this.surname = surname;
    }   // method to set the keeper Surname

    public String getContactNumber() {
        return contactNumber;
    }       // method to get the keeper contact number

    public void setContactNumber(String contactNumber) {    // method to set the keeper contact number
        this.contactNumber = contactNumber;
    }

    public String getCageAllocated() {
        return cageAllocated;
    }   // method to get the keeper cage allocation

    public void setCageAllocated(String cageAllocated) {    // method to set the keeper allocation
        this.cageAllocated = cageAllocated;
    }

    public String displayKeeperDetails(){   // method to display the keeper details (ID,Name,Surname,Contact,Cage)
        return "Keeper: " + getKeeperID()+" "+ getFirstName()+" "+getSurname()+" "+getContactNumber()+ " "+ getCageAllocated();
    }
}
