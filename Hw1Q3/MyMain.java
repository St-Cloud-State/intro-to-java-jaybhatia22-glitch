public class MyMain {
    public static void main(String[] args) {
        PersonList list = new PersonList();

        // Load people from file
        list.store("people.txt");

        // Display all
        System.out.println("All people:");
        list.display();

        // Test find
        System.out.println("\nSearching for P002: index = " + list.find("P002"));
        System.out.println("Searching for P999: index = " + list.find("P999"));
    }
}
