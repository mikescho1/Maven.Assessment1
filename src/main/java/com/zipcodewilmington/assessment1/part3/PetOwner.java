package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private String name;
    private Pet [] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        if(pets != null)    {
        for (int i = 0; i < pets.length ; i++) {
            pets[i].setOwner(this);
        }
        }//could also have created a pet ArrayList field and do this.pets.addAll(Arrays.asList(pets));
        ;

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        pet.setOwner(this);
        if(pets == null)    {
            pets = new Pet[1];
            pets[0] =  pet;
            }   else    {
            Pet [] tempPets = new Pet[pets.length + 1];

            for (int i = 0; i <pets.length ; i++) {
                tempPets[i] = pets[i];
            }

            tempPets[tempPets.length] = pet;
            pets = tempPets;
        }

        }







    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {


    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pet.getOwner() == this;
    }  //or you could loop through the array and return true if i equals the pet, else false;

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int minAge = pets[0].getAge();
        for (int i = 1; i < pets.length; i++) {
            if(pets[i].getAge() < minAge)    {
                minAge = pets[i].getAge();

        }
        }
        return minAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int maxAge = pets[0].getAge();
        for (int i = 1; i < pets.length; i++) {
            if (pets[i].getAge() > maxAge) {
                maxAge = pets[i].getAge();

            }
        }
        return maxAge;
    }

    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum = 0;


        for (int i = 0; i < pets.length; i++) {
            sum += pets[i].getAge();


        }


        return sum / pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPets(Pet pets) {
       // this.pets = pets;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
        // if used an ArrayList, must do pets.toArray(new Pet[petsIOwn.size()]);
    }
}
