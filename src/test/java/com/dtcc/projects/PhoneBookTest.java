package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookTest {

    @Test
    public void addTest(){
        PhoneBook phoneBook = new PhoneBook();
        String name = "Zan";
        String phoneNumber = "12345432";
        phoneBook.add(name,phoneNumber);

        Assert.assertTrue(phoneBook.phoneBookMap.containsKey(name));
        Assert.assertEquals(phoneNumber,phoneBook.phoneBookMap.get(name).get(0));
    }

    @Test
    public void adAllTest(){
        //Given
        PhoneBook phonebook = new PhoneBook();
        String name = "Zan again";
        String[] numbersArray = {"127575877", "64182922", "26853733"};

        //When
        phonebook.addAll(name, numbersArray);

        //Then
        Assert.assertEquals(Arrays.asList(numbersArray), phonebook.phoneBookMap.get(name));
    }

    @Test
    public void removeTest(){
        PhoneBook phonebook = new PhoneBook();
        String name1 = "Emad";
        String number1 = "555555555";
        phonebook.add(name1, number1);

        String name2 = "Cedric";
        String number2 = "111111111";
        phonebook.add(name2, number2);

        phonebook.remove(name1);

        Assert.assertFalse(phonebook.phoneBookMap.containsKey(name1));
    }

    @Test
    public void hasEntryTest(){
        PhoneBook phonebook = new PhoneBook();
        String name1 = "Emad";
        String number1 = "555555555";
        phonebook.add(name1, number1);

        phonebook.hasEntry(name1);

        Assert.assertTrue(phonebook.phoneBookMap.containsKey(name1));
    }

    @Test
    public void lookupTest(){
        PhoneBook phonebook = new PhoneBook();
        String name1 = "Emad";
        ArrayList<String> numbersArray= new ArrayList<String>();
        numbersArray.add("7667676766");
        phonebook.phoneBookMap.put(name1,numbersArray);

        phonebook.lookup(name1);

        Assert.assertEquals(numbersArray, phonebook.lookup(name1));
    }

    @Test
    public void reverseLookupTest(){
        PhoneBook phonebook = new PhoneBook();
        String name = "Emad";
        String phoneNumber= ("7667676766");

        phonebook.reverseLookup(phoneNumber);

        Assert.assertEquals(phoneNumber, phonebook.phoneBookMap.containsValue(name));
    }

    @Test
    public void getAllContactNamesTest(){
        PhoneBook phonebook = new PhoneBook();
        String name1 = "Emad";
        String number1 = "555555555";
        phonebook.add(name1, number1);

        String name2 = "Cedric";
        String number2 = "111111111";
        phonebook.add(name2, number2);

        phonebook.getAllCintactNames();

        Assert.assertEquals(getAllCintactNames, phonebook.phoneBookMap.containsValue(name1,name2));
    }
}