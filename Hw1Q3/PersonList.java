import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class PersonList {
    private LinkedList<Person> people;

    public PersonList() {
        people = new LinkedList<>();
    }

    // Store data from file
    public void store(String filename) {
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNext()) {
                String firstName = sc.next();
                String lastName = sc.next();
                String id = sc.next();
                people.add(new Person(firstName, lastName, id));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Display all people
    public void display() {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    // Find by id
    public int find(String sid) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}
