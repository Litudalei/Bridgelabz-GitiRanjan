package Day10;

import java.util.*;

public class AddressBookSystem {

    private Map<String, AddressBook> bookMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void addAddressBook() {
        System.out.print("Enter new Address Book Name: ");
        String name = sc.next();

        if (bookMap.containsKey(name)) {
            System.out.println("Address Book already exists!");
        } else {
            bookMap.put(name, new AddressBook());
            System.out.println("Address Book '" + name + "' created successfully!");
        }
    }

    public void showAddressBooks() {
        if (bookMap.isEmpty()) {
            System.out.println("No Address Books available.");
            return;
        }

        System.out.println("Available Address Books:");
        for (String name : bookMap.keySet()) {
            System.out.println("- " + name);
        }
    }

    public void openAddressBook() {
        System.out.print("Enter Address Book Name to Open: ");
        String name = sc.next();

        AddressBook book = bookMap.get(name);

        if (book == null) {
            System.out.println("Address Book not found!");
        } else {
            System.out.println("Opened Address Book: " + name);
            // now perform operations like add/edit/delete contacts in book
        }
    }
}

