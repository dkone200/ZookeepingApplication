

public class Mediumcage extends Cage {
    private int maxCapacity=5;



    public Mediumcage(String cageID, String cageNumber, String description) { // medium cage constructor
        super(cageID, cageNumber, description);
    }




    public String DisplayMediumCageDetails(){ // method tha displays the cage details, ID, Number, Description

        return "Medium Cage contains: "+ getCageID()+ " "+getCageNumber()+ " "+getDescription();
    }



    public int CageCapacity(){
        return maxCapacity;
    } //method thar returns the medium cage maximum capacity

}

