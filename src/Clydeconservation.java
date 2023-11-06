import java.util.Scanner;
public class Clydeconservation {


    public static void main(String[] args) {

        String id = "";                                         // declares and initialize a string ID variable
        String number = "";                                     // declares and initialize a string number variable
        String desc = "";                                       // declares and initialize a string description variable
        Smallcage smallcage= new Smallcage(id,number,desc);     // creates an object of small cage
        Mediumcage mediumcage = new Mediumcage(id,number, desc); // creates an object of medium cage
        Largecage largecage = new Largecage(id, number, desc);  // creates an object of large cage
        Allocation allocation= new Allocation(smallcage,mediumcage,largecage); // creates an object of allocation

        int option=0;                               //declare and initialize a variable to hold the menu option selection
        int input_option=0;                         //declare and initialize a variable to hold the menu input option selection

        Scanner sc=new Scanner(System.in);          // new scanner sc

        do{
            System.out.println("Please choose an option from the following menu"+"\n"); //Display general menu option
            System.out.println("1: Allocate animal to cage");
            System.out.println("2: Allocate keeper to cage");
            System.out.println("3: Delete animal from a cage");
            System.out.println("4: Delete keeper from a cage");
            System.out.println("5: Display cage details");
            System.out.println("6: Exit"+"\n");
            System.out.print("Choose: ");

            option=Validate.validateOptionInteger();        // calls the validate option method from the Validate class and assigns the value to the variable option


            switch (option) {

                case 1:



                            System.out.print("Please enter animal ID: "); // Displays output for the value requested
                            String animalID = sc.next();                  // inputs value using a scanner
                            sc.nextLine();
                            System.out.print("Please enter animal Name: "); // Displays output for the value requested
                            String animalName = sc.next();                  // inputs value using a scanner
                            sc.nextLine();
                            System.out.print("Please enter animal type: "); // Displays output for the value requested
                            String animalType = sc.next();                  // inputs value using a scanner
                            sc.nextLine();

                            System.out.print("Please enter animal category (predator/prey): "); // Displays output for the value to be inputted
                            String animalCat = sc.next();                                       // inputs value using a scanner
                            sc.nextLine();


                            System.out.print("Please enter animal date of birth: "); // Displays output for the value requested
                            String animalDateOB = sc.next();                          // inputs value using a scanner
                            sc.nextLine();
                            System.out.print("Please enter animal acquisition date: "); // Displays output for the value requested
                            String animalDateOA = sc.next();                            // inputs value using a scanner
                            sc.nextLine();
                            System.out.print("Please enter animal sex (male/female): "); // Displays output for the value requested
                            String animalSex = sc.next();                                // inputs value using a scanner
                            sc.nextLine();


                            Animal animal = new Animal(animalID, animalName, animalType, animalCat, animalDateOB, animalDateOA, animalSex); // creates animal object and passes the values to the animal class
                            System.out.println(animal.displayAnimalDetails() + "\n"); // calls the display animal details method


                            do {
                                System.out.println("Choose cage to add animal to: " + "\n");        //display cage type menu option
                                System.out.println("1: Small cage");
                                System.out.println("2: Medium cage");
                                System.out.println("3: Large cage");
                                System.out.println("4: Exit");

                                input_option = Validate.validateInputOptionInteger();               // calls the validate option method from the Validate class and assigns the value to the variable input_option

                                if (input_option == 1) {

                                    System.out.println("Please enter the cage id: ");
                                    String cagesID = sc.next();                                     // input cage ID
                                    sc.nextLine();
                                    System.out.println("Please enter the number id: ");
                                    String cagesNumber = sc.next();                                 // input cage Number
                                    sc.nextLine();
                                    System.out.println("Please enter the cage description: ");
                                    String cagesDescription = sc.next();                            // input cage Description
                                    sc.nextLine();
                                    Smallcage smallcage1 = new Smallcage(cagesID, cagesNumber, cagesDescription);   // passes the details to the Small cage class

                                    smallcage1.DisplaySmallCageDetails();

                                    if (allocation.SmallCageSize() < smallcage.CageCapacity()) {                    // condition to check if the cage is full
                                        allocation.addsmAnimal(animal);
                                    } else {
                                        System.out.println("The cage is full");
                                    }
                                } else if (input_option == 2) {

                                    System.out.println("Please enter the cage id: ");
                                    String cagemID = sc.next();
                                    sc.nextLine();
                                    System.out.println("Please enter the number id: ");
                                    String cagemNumber = sc.next();
                                    sc.nextLine();
                                    System.out.println("Please enter the cage description: ");
                                    String cagemDescription = sc.next();
                                    sc.nextLine();
                                    Mediumcage mediumcage1 = new Mediumcage(cagemID, cagemNumber, cagemDescription);        //Passes the details to the medium cage class
                                    mediumcage1.DisplayMediumCageDetails();

                                    if (allocation.MediumCageSize() < mediumcage.CageCapacity() && animal.getCategory().equals("prey")) { // condition to check if the cage is full and if the animal is a prey or a predator

                                        allocation.addmdAnimal(animal);     //allocates the animal if the cage is available
                                    } else {
                                        System.out.println("The cage can not host this animal");    // error message when the cage is not available
                                    }
                                } else if (input_option == 3) {

                                    if (smallcage.CageSize() == 0) {                //checks if the cage is empty


                                        System.out.println("Please enter the cage id: ");
                                        String cagelID = sc.next();
                                        sc.nextLine();
                                        System.out.println("Please enter the number id: ");
                                        String cagelNumber = sc.next();
                                        sc.nextLine();
                                        System.out.println("Please enter the cage description: ");
                                        String cagelDescription = sc.next();
                                        sc.nextLine();
                                        Largecage largecage1 = new Largecage(cagelID, cagelNumber, cagelDescription);       //Passes the details to the large cage class
                                        largecage1.DisplayLargeCageDetails();
                                        if (allocation.LargeCageSize() < largecage.CageCapacity() && animal.getCategory().equals("prey")) {     // condition to check if the cage is full and if the animal is a prey or a predator
                                            allocation.addlrAnimal(animal);
                                        } else {
                                            System.out.println("The cage can not host this animal");
                                        }
                                    } else {
                                        System.out.println(smallcage.getCageID());
                                    }

                                }


                            } while (input_option != 4);


                            break;



                case 2:
                        System.out.print("Please enter keeper ID: ");           // Displays output for the value requested
                        String keeperID=sc.next();                              // inputs value using a scanner
                        sc.nextLine();
                        System.out.print("Please enter keeper first name: ");   // Displays output for the value requested
                        String firstName=sc.next();                             // inputs value using a scanner
                        sc.nextLine();
                        System.out.print("Please enter keeper surname: ");      // Displays output for the value requested
                        String surname=sc.next();                               // inputs value using a scanner
                        sc.nextLine();
                        System.out.print("Please enter keeper address: ");      // Displays output for the value requested
                        String address=sc.next();                               // inputs value using a scanner
                        sc.nextLine();
                        System.out.print("Please enter contact number: ");      // Displays output for the value requested
                        String contactNumber=sc.next();                         // inputs value using a scanner
                        sc.nextLine();
                        System.out.print("Please enter keeper position (head/assistant): ");    // Displays output for the value requested
                        String position=sc.next();                                              // inputs value using a scanner
                        sc.nextLine();

                        Keeper keeper= new Keeper(keeperID, firstName, surname, address, contactNumber, position); //creates a keeper object and passes the values to the keeper class
                        System.out.println(keeper.displayKeeperDetails()+"\n");
                        do{
                        System.out.println("Choose a cage to allocate keeper to");
                        System.out.println("1: Small cage");
                        System.out.println("2: Medium cage");
                        System.out.println("3: Large cage");
                        System.out.println("4: Exit");

                        input_option=Validate.validateInputOptionInteger();
                        switch (input_option){
                            case 1: if (allocation.isSmKeeperAllocated()==true){        //calls is keeper allocated method and checks if te condition is true
                                allocation.addsmKeeper(keeper);                         // when condition is true, allocates keeper to the cage
                                }else {
                                System.out.println("A keeper is already allocated to the cage");    //when the condition is false, displays error message
                                }
                                break;
                            case 2: if (allocation.isMdKeeperAllocated()==true){         //calls is keeper allocated method and checks if te condition is true
                                    allocation.addmdKeeper(keeper);                      // when condition is true, allocates keeper to the cage
                                }else {
                                    System.out.println("A keeper is already allocated to the cage");    //when the condition is false, displays error message
                                }
                                break;
                            case 3: if (allocation.isLrKeeperAllocated()==true){            //calls is keeper allocated method and checks if te condition is true
                                    allocation.addlrKeeper(keeper);                         // when condition is true, allocates keeper to the cage
                                }else {
                                    System.out.println("A keeper is already allocated to the cage");    //when the condition is false, displays error message
                                }

                                break;
                        }
                    }while (input_option!=4);
                        break;

                case 3: do{
                        System.out.println("Please choose a cage to remove animal from: ");     // displays animal remove menu
                        System.out.println("1: Small cage");
                        System.out.println("2: Medium cage");
                        System.out.println("3: Large cage");
                        System.out.println("4: Exit");
                        input_option=Validate.validateInputOptionInteger();
                        switch (input_option){
                            case 1: System.out.print("Please enter an animal ID to be removed: ");
                                    String anSmallID = sc.next();                                   // input animal ID to be removed from a small cage
                                    sc.nextLine();
                                    allocation.removeSmAnimal(anSmallID);                           // call the remove animal from a small cage method
                                    allocation.disSmallCage();                                      // display small cage
                                break;
                            case 2: System.out.print("Please enter an animal ID to be removed: ");
                                    String anMediumID = sc.next();                                  // input animal ID to be removed from a medium cage
                                    sc.nextLine();
                                    allocation.removeMdAnimal(anMediumID);                          // call the remove animal from a medium cage method
                                    allocation.disMediumCage();                                     // display medium cage
                                break;
                            case 3: System.out.print("Please enter an animal ID to be removed: ");
                                    String anLargeID = sc.next();                                   // input animal ID to be removed from a large cage
                                    sc.nextLine();
                                    allocation.removeLrAnimal(anLargeID);                           // call the remove animal from a large cage method
                                    allocation.disLargeCage();                                      // display large cage
                                break;
                        }
                        }while (input_option!=4);

                break;


                    case 4: do{
                                System.out.println("Please choose a cage to remove keeper from: ");     //Cage menu options
                                System.out.println("1: Small cage");
                                System.out.println("2: Medium cage");
                                System.out.println("3: Large cage");
                                System.out.println("4: Exit");

                                input_option=Validate.validateInputOptionInteger();

                                switch (input_option){
                                    case 1: System.out.print("Please enter an keeper ID to be removed: ");
                                        String keSmallID = sc.next();                                       // input keeper ID to be removed from a small cage
                                        sc.nextLine();
                                        allocation.removeSmKeeper(keSmallID);                               // call the remove keeper from a medium cage method
                                        allocation.disSmallCage();                                          // display small cage
                                        break;
                                    case 2: System.out.print("Please enter an keeper ID to be removed: ");
                                        String keMediumID = sc.next();                                      // input keeper ID to be removed from a small cage
                                        sc.nextLine();
                                        allocation.removeMdKeeper(keMediumID);                              // call the remove keeper from a medium cage method
                                        allocation.disMediumCage();                                         // display medium cage
                                        break;
                                    case 3: System.out.print("Please enter an keeper ID to be removed: ");
                                        String keLargeID = sc.next();                                       // input keeper ID to be removed from a small cage
                                        sc.nextLine();
                                        allocation.removeLrKeeper(keLargeID);                               // call the remove keeper from a large cage method
                                        allocation.disLargeCage();                                          // display large cage
                                        break;
                                }
                            }while (input_option!=4);
                    break;

                case 5: do{
                        System.out.println("Please choose cage details would you like to view: ");      // display cage menu option
                        System.out.println("1: Small cage");
                        System.out.println("2: Medium cage");
                        System.out.println("3: Large cage");
                        System.out.println("4: Exit");

                        input_option=Validate.validateInputOptionInteger();

                        switch (input_option){
                            case 1: allocation.disSmallCage();                                          //calls the display small cage method from the allocation class
                            break;
                            case 2: allocation.disMediumCage();                                         //calls the display medium cage method from the allocation class
                            break;
                            case 3: allocation.disLargeCage();                                          //calls the display large cage method from the allocation class
                            break;
                        }
                        }while (input_option!=4);

                    break;


            }

        }while (option!=6);


    }
}
