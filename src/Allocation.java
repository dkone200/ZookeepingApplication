import java.util.*;
public class Allocation {
    private Smallcage smallcage ;
    private Mediumcage mediumcage;
    private Largecage largecage;

    private ArrayList <Animal> smAnimal = new ArrayList<>();    // initialization of an arraylist to keep track of animal allocated to the small cage
    private ArrayList <Keeper> smKeeper = new ArrayList<>();    // initialization of an arraylist to keep track of keeper allocated to the small cage
    private ArrayList <Animal> mdAnimal = new ArrayList<>();    // initialization of an arraylist to keep track of animal allocated to the medium cage
    private ArrayList <Keeper> mdKeeper = new ArrayList<>();    // initialization of an arraylist to keep track of keeper allocated to the medium cage
    private ArrayList <Animal> lrAnimal = new ArrayList<>();    // initialization of an arraylist to keep track of animal allocated to the large cage
    private ArrayList <Keeper> lrKeeper = new ArrayList<>();    // initialization of an arraylist to keep track of keeper allocated to the large cage

    public Allocation (Smallcage smallcage, Mediumcage mediumcage, Largecage largecage){ //creates a constructor
        this.smallcage= smallcage;
        this.mediumcage= mediumcage;
        this.largecage= largecage;
    }

    public void addsmAnimal (Animal animal){        // method to add animal in the animal small cage arraylist
        AddAnimalToCage(animal);
    }

    private void AddAnimalToCage(Animal animal){
        smAnimal.add(animal);
        System.out.println("Animal added successfully");
    }

    public void addsmKeeper (Keeper keeper){        // method to add keeper to keeper small cage array list
        if (smKeeper.size()<=1) {                   // if statement used to check the cage availability
            smKeeper.add(keeper);
            System.out.println("Keeper added successfully");
        } else{
            System.out.println("A keeper has already been added");

        }
    }
    public void addmdAnimal (Animal animal){        //method to add animal in the animal medium cage arraylist
        mdAnimal.add(animal);
        System.out.println("Animal added successfully");
    }
    public void addmdKeeper (Keeper keeper){        // method to add keeper to keeper medium cage array list
        if (mdKeeper.size()<=1) {                   // if statement used to check the cage availability
            mdKeeper.add(keeper);
            System.out.println("Keeper added successfully");
        } else{
            System.out.println("A keeper has already been added");

        }
    }
    public void addlrAnimal (Animal animal){        //method to add animal in the animal large cage arraylist
        lrAnimal.add(animal);
        System.out.println("Animal added successfully");
    }
    public void addlrKeeper (Keeper keeper){        // method to add keeper to keeper large cage array list
        if (lrKeeper.size()<=1) {                   // if statement used to check the cage availability
            lrKeeper.add(keeper);
            System.out.println("Keeper added successfully");
        } else{
            System.out.println("A keeper has already been added");

        }
    }

    public boolean isSmKeeperAllocated(){       // method to check if the small cage has a keeper already allocated
        return smKeeper.size()==0;
    }

    public boolean isMdKeeperAllocated(){       // method to check if the medium cage has a keeper already allocated
        return mdKeeper.size()==0;
    }

    public boolean isLrKeeperAllocated(){       // method to check if the large cage has a keeper already allocated
        return lrKeeper.size()==0;
    }

    public int SmallCageSize(){                 // method to return how many animals there are in the small cage
        return smAnimal.size();
    }
    public int MediumCageSize(){                // method to return how many animals there are in the medium cage
        return mdAnimal.size();
    }

    public int LargeCageSize(){                 // method to return how many animals there are in the large cage
        return lrAnimal.size();
    }


    public void disSmallCage(){     //method to display the small cage content
        System.out.println("----------------Small cage "+smallcage.getCageID()+ "-------------");
        System.out.println("-----------------------Animals-----------------------");
        for (Animal animal : smAnimal){
            System.out.println("\n"+ animal.displayAnimalDetails()+"\n");
        }

        System.out.println("----------------------Keeper--------------------------");
        for (Keeper keeper : smKeeper){
            System.out.println("\n"+ keeper.displayKeeperDetails()+"\n");
        }

    }
    public void disMediumCage(){
        System.out.println("----------------Medium cage "+mediumcage.getCageID()+ "-------------");
        System.out.println("-----------------------Animals-----------------------");
        for (Animal animal : mdAnimal){
            System.out.println("\n"+ animal.displayAnimalDetails()+"\n");
        }

        System.out.println("----------------------Keeper--------------------------");
        for (Keeper keeper : mdKeeper){
            System.out.println("\n"+ keeper.displayKeeperDetails()+"\n");
        }

    }
    public void disLargeCage(){
        System.out.println("----------------Large cage "+largecage.getCageID()+ "-------------");
        System.out.println("-----------------------Animals-----------------------");
        for (Animal animal : lrAnimal){
            System.out.println("\n"+ animal.displayAnimalDetails()+"\n");
        }

        System.out.println("----------------------Keeper--------------------------");
        for (Keeper keeper : lrKeeper){
            System.out.println("\n"+ keeper.displayKeeperDetails()+"\n");
        }

    }

    public void removeSmAnimal(String id) {
        Iterator <Animal> iter = smAnimal.iterator();

        while (iter.hasNext()) {
        Animal animal= iter.next();

        if (animal.getAnimalID().equals(id)){
            iter.remove();
            System.out.println("Animal successfully removed ");
        }else {
                System.out.println("Animal does not exist"+"\n");
        }
        }
    }
    public void removeSmKeeper(String id) {
        Iterator <Keeper> iter = smKeeper.iterator();

        while (iter.hasNext()) {
            Keeper keeper= iter.next();

            if (keeper.getKeeperID().equals(id)){
                iter.remove();
                System.out.println("Keeper successfully removed ");
            }else {
                System.out.println("Keeper does not exist"+"\n");
            }
        }
    }
    public void removeMdAnimal(String id) {
        Iterator <Animal> iter = mdAnimal.iterator();

        while (iter.hasNext()) {
            Animal animal= iter.next();

            if (animal.getAnimalID().equals(id)){
                iter.remove();
                System.out.println("Animal successfully removed ");
            }else {
                System.out.println("Animal does not exist"+"\n");
            }
        }
    }
    public void removeMdKeeper(String id) {
        Iterator <Keeper> iter = mdKeeper.iterator();

        while (iter.hasNext()) {
            Keeper keeper= iter.next();

            if (keeper.getKeeperID().equals(id)){
                iter.remove();
                System.out.println("Keeper successfully removed ");
            }else {
                System.out.println("Keeper does not exist"+"\n");
            }
        }
    }
    public void removeLrAnimal(String id) {
        Iterator <Animal> iter = lrAnimal.iterator();

        while (iter.hasNext()) {
            Animal animal= iter.next();

            if (animal.getAnimalID().equals(id)){
                iter.remove();
                System.out.println("Animal successfully removed"+"\n");
            }else {
                System.out.println("Animal does not exist"+"\n");
            }
        }
    }
    public void removeLrKeeper(String id) {
        Iterator <Keeper> iter = lrKeeper.iterator();

        while (iter.hasNext()) {
            Keeper keeper= iter.next();

            if (keeper.getKeeperID().equals(id)){
                iter.remove();
                System.out.println("Keeper successfully removed ");
            }else {
                System.out.println("Keeper does not exist"+"\n");
            }
        }
    }



}
