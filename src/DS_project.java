import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

 class PhoneDirectory {
     private static final int MAX_CONTACTS = 100;
    private static ArrayList<Contact> phoneDirectory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;

        do {
            System.out.println("\nOptions:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Remove Contact");
            System.out.println("5. Display Directory");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case '1':
                    addContact();
                    break;
                case '2':
                    searchContact();
                    break;
                case '3':
                    editContact();
                    break;
                case '4':
                    removeContact();
                    break;
                case '5':
                    displayDirectory();
                    break;
                case '6':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != '6');
    }

    private static void addContact() {
        if (phoneDirectory.size() < MAX_CONTACTS) {
            System.out.print("Enter contact name: ");
            String name = scanner.nextLine();
            System.out.print("Enter contact phone number: ");
            String phone = scanner.nextLine();
            phoneDirectory.add(new Contact(name, phone));
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Phone directory is full. Cannot add more contacts.");
        }
    }

    private static void searchContact() {
        System.out.print("Enter name or phone number to search: ");
        String query = scanner.nextLine();

        boolean found = false;
        for (Contact contact : phoneDirectory) {
            if (contact.name.contains(query) || contact.phone.contains(query)) {
                System.out.println("Contact found: " + contact.name + ", " + contact.phone);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    private static void editContact() {
        System.out.print("Enter the name of the contact you want to edit: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Contact contact : phoneDirectory) {
            if (contact.name.equals(name)) {
                System.out.print("Enter new phone number for " + name + ": ");
                contact.phone = scanner.nextLine();
                System.out.println("Contact updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    private static void removeContact() {
        System.out.print("Enter the name of the contact you want to remove: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < phoneDirectory.size(); i++) {
            if (phoneDirectory.get(i).name.equals(name)) {
                phoneDirectory.remove(i);
                System.out.println("Contact removed successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    private static void displayDirectory() {
        if (phoneDirectory.isEmpty()) {
            System.out.println("Phone directory is empty.");
        } else {
            System.out.println("Phone Directory:");
            for (Contact contact : phoneDirectory) {
                System.out.println(contact.name + ", " + contact.phone);
            }
        }
    }
}