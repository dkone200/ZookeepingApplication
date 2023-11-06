
public class Largecage extends Cage{
     private int maxCapacity=10; // cage maximum capacity



    public Largecage(String cageID, String cageNumber, String description) {
        super(cageID, cageNumber, description);
    }
    public String DisplayLargeCageDetails(){     //method that displays the cage details, ID, Number, Description;

        return "Large Cage contains: "+ getCageID()+ " "+getCageNumber()+ " "+getDescription();
    }
    public int CageCapacity(){
        return maxCapacity;
    } // method the returns the large cage maximum capacity


}
