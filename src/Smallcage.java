import java.util.*;


public class Smallcage extends Cage{
    private int maxCapacity=1;                      //cage maximum capacity

    ArrayList<Smallcage> SmallCage= new ArrayList<>(); //declares a small cage arraylist



    public Smallcage(String cageID, String cageNumber, String description) { // small cage constructor
        super(cageID, cageNumber, description);
    }

    public void setSmallCage(Smallcage SmallCage){      //adds details to the small cage arraylist
        SmallCage.SmallCage.add(SmallCage);
    }




    public String DisplaySmallCageDetails(){        // returns details, ID, Number, Description

        return "Small Cage : "+ getCageID()+ " "+getCageNumber()+ " "+getDescription();
    }
    public int CageCapacity(){      // returns cage maximum capacity
        return maxCapacity;
    }


    public int CageSize(){      // returns cage size
        return SmallCage.size();
    }



}
