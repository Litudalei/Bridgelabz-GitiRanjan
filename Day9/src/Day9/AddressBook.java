package Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Add contact
    public void addContact() {
        System.out.println("Enter First Name: ");
        String first = sc.nextLine();

        System.out.println("Enter Last Name: ");
        String last = sc.nextLine();

        System.out.println("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("Enter City: ");
        String city = sc.nextLine();

        System.out.println("Enter State: ");
        String state = sc.nextLine();

        System.out.println("Enter Zip: ");
        String zip = sc.nextLine();

        System.out.println("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.println("Enter Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(first, last, address, city, state, zip, phone, email);
        contacts.add(contact);

        System.out.println("Contact Added Successfully!");
    }

    // Edit contact by first name
    public void editContact() {
        System.out.print("Enter First Name of the contact to edit: ");
        String name = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {

                System.out.print("New Last Name: ");
                c.setLastName(sc.nextLine());

                System.out.print("New Address: ");
                c.setAddress(sc.nextLine());

                System.out.print("New City: ");
                c.setCity(sc.nextLine());

                System.out.print("New State: ");
                c.setState(sc.nextLine());

                System.out.print("New Zip: ");
                c.setZip(sc.nextLine());

                System.out.print("New Phone: ");
                c.setPhoneNumber(sc.nextLine());

                System.out.print("New Email: ");
                c.setEmail(sc.nextLine());

                System.out.println("Contact Updated Successfully!");
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    // Delete contact by first name
    public void deleteContact() {
        System.out.print("Enter First Name of the contact to delete: ");
        String name = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                contacts.remove(c);
                System.out.println("Contact Deleted Successfully!");
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    // Display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty.");
            return;
        }

        System.out.println("----- All Contacts -----");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
