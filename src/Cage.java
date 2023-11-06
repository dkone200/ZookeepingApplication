public class Cage {
    private String cageID;  //initialization of a string called CageID in order to hold the cage ID
    private String cageNumber;  //initialization of a string called CageNumber in order to hold the cage Number
    private String description; //initialization of a string called CageDescription in order to hold the cage description




    public Cage(String cageID, String cageNumber, String description){ //Cage class constructor
        this.cageID = cageID;
        this.cageNumber = cageNumber;
        this.description = description;

    }

    public String getCageID() {
        return cageID;
    } // method to get the Cage ID

    public void setCageID(String cageID) {
        this.cageID = cageID;
    }    //method to set the cage ID

    public String getCageNumber() {
        return cageNumber;
    } //method to get the cage number

    public void setCageNumber(String cageNumber) {
        this.cageNumber = cageNumber;
    } // method to set the cage number

    public String getDescription() {
        return description;
    } //method to get the cage id

    public void setDescription(String description) { // method to set the cage description
        this.description = description;
    }



}
