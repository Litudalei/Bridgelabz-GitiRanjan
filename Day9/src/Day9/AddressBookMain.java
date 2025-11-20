package Day9;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        while (true) {
            System.out.println("\n====== Address Book Menu ======");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  // clear input buffer

            switch (choice) {
                case 1: book.addContact(); break;
                case 2: book.editContact(); break;
                case 3: book.deleteContact(); break;
                case 4: book.displayContacts(); break;
                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
