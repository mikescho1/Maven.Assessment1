package com.zipcodewilmington.assessment1.part3;

import com.sun.xml.internal.fastinfoset.util.DuplicateAttributeVerifier;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class PetTest {



    @Test
    public void testInheritance() {

        Pet pet1 = new Dog("rex", 8);

        boolean actual = pet1 instanceof Pet;
        Assert.assertEquals(true, actual);

    }

    @Test
    public void testImplementation() {
        Pet pet2 = new Dog();
        boolean actual = pet2 instanceof Animal;
        Assert.assertEquals(true, actual);
    }

    @Test
    public void setOwnerTest() {
        // Given
        Pet pet3 = new Dog("charlie", 3);
        PetOwner petOwner2 = new PetOwner("Dan");
        PetOwner expected = petOwner2;
        // When
        pet3.setOwner(petOwner2);
        PetOwner actual = pet3.getOwner();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getOwnerTest() {
        // Given
        Pet p = new Dog();
        PetOwner expected = new PetOwner(null, p);

        // When
        PetOwner actual = p.getOwner();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
