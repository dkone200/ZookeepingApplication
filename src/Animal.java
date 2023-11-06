public class Animal {
    private String animalID;        //declares animal ID string
    private String name;            //declares animal name string
    private String type;            //declares animal type string
    private String category;        //declares animal category string
    private String dateOfBirth;     //declares animal date of birth string
    private String dateOfAcquisition;   //declares animal date of acquisition string
    private String sex;             //declares animal sex string

    public Animal( String animalID, String name, String type, String category, String dateOfBirth, String dateOfAcquisition, String sex){ // animal constructor
        this.animalID = animalID;
        this.name = name;
        this.type = type;
        this.category = category;
        this.dateOfBirth = dateOfBirth;
        this.dateOfAcquisition = dateOfAcquisition;
        this.sex = sex;
    }
    public Animal(){    // overloaded method

    }

    public String getAnimalID() { //method to get the animal ID
        return animalID;
    }

    public void setAnimalID(String animalID) { // method to set the animal ID
        this.animalID = animalID;
    }

    public String getName() { // method to get the name
        return name;
    }

    public void setName(String name) { // method to set the name
        this.name = name;
    }

    public String getType() { // method to get the type
        return type;
    }

    public void setType(String type) { // method to set the type
        this.type = type;
    }

    public String getCategory() { // method to get the category
        return category;
    }

    public void setCategory(String category) throws IDException{ // method to set the category
        if(getCategory().equals("predator") || getCategory().equals("prey")) {
            this.category = category;
        }else
        throw new IDException("The animal can only be a predator or a prey");
    }

    public String getDateOfBirth() { // method to get the date of birth
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {    // method to set the date of birth
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfAcquisition() {  // method to get the date of acquisition
        return dateOfAcquisition;
    }

    public void setDateOfAcquisition(String dateOfAcquisition) {    // method to set the date of acquisition
        this.dateOfAcquisition = dateOfAcquisition;
    }

    public String getSex() {    // method to get the sex
        return sex;
    }

    public void setSex(String sex) {    // method to get the sex
        this.sex = sex;
    }

    public String displayAnimalDetails(){ // method to display the animal details

        return "Animal: " + getAnimalID() +" "+ getName()+ " "+ getCategory()+ " "+ getDateOfBirth()+ " "+ getDateOfAcquisition()+ " "+ getSex();

    }
}
