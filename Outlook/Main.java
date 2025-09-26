import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);

        Person person1 = new Person("Anna");
        Person person2 = new Person("Bob");
        Person person3 = new Person("Carl");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        System.out.println("This is the current list:");
        System.out.println(persons);
        System.out.println("---------------------------------------------------------");
        System.out.println("Please enter the name of the person you would like to remove: ");

        String name = keyboard.nextLine();
        Person personToSearchFor = new Person(name);

        int indexOfPersonToRemove = persons.indexOf(personToSearchFor);
        persons.remove(indexOfPersonToRemove);

        System.out.println("This is the current list" + persons);
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}