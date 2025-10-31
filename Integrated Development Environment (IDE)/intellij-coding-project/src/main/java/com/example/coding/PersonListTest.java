package com.example.coding;

import java.util.ArrayList;

public class PersonListTest
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        PersonList personList = new PersonList();
        personList.addPerson(person1);
        personList.addPerson(person2);
        personList.addPerson(person3);

        personList.printAllThePersonsByCallingTheirToStringMethodForEachOneAndPrintingItToConsole();
    }
}
