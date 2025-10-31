package com.example.coding;



import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> persons;    public PersonList() {
                                            persons = new ArrayList<>();
    }

    public void addPerson(Person person)    {        if(person==null) return; // brug Ctrl+Shift+Enter når du skriver nye sætninger

                                                            persons.add(person);    }

    public Person findPersonByAge(int i) {        for (Person person : persons)
        {





            if(person.getAge() == i)
            {return person;
            }
        }return null;}

    public Person findReallyOldPerson()
    {for (Person person :persons) {            if(person.getAge() > 100)
            {
                return person;
            }}
        return null;
    }

    public void changePersonName(String oldName, String newName)    {        for (int i = 0; i < persons.size(); i++)        {            if(persons.get(i).getName().equals(oldName))            {                persons.get(i).setName(newName);            }        }}

    public boolean isEmpty()
    {
                                        boolean listIsEmpty = persons.isEmpty();
                        if(listIsEmpty == true)
                                    {
                                        return true;
                                    }
                        else
                                                    {
                                                        return false;
                                                    }
    }


    public void printAllThePersonsByCallingTheirToStringMethodForEachOneAndPrintingItToConsole()
    {
                                                            System.out.println("TODO: Print stuff");
    }
}
