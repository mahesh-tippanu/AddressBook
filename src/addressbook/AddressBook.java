package com.bridgelabzz;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class AddressBook {
    static String name;
    static boolean is_Running = false;
    HashMap<String, ContactInfo> addressBook;
    public AddressBook() {
        addressBook = new HashMap<>();
    }
    //Driver code
    public static void main(String[] args) {
        System.out.println("Welcome to the ADDRESS BOOK");
        Sorting sorting = new Sorting();
        HashMap<String, AddressBook> multiAddressBook = new HashMap<>();
        AddressBook addressBookObj1 = new AddressBook();
        AddressBook addressBookObj2 = new AddressBook();
        AddressBook addressBookObj3 = new AddressBook();
        multiAddressBook.put("AB1", addressBookObj1);
        multiAddressBook.put("AB2", addressBookObj2);
        multiAddressBook.put("AB3", addressBookObj3);
        while (!is_Running) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 ,2 ,3 for diff addressBook and 4 to exit");
            int option = scanner.nextInt();
            String key = null;
            switch (option) {
                case 1:
                    key = "AB1";
                    break;
                case 2:
                    key = "AB2";
                    break;
                case 3:
                    key = "AB3";
                    break;
            }
            if (option == 4) break;
            System.out.println(" Enter 1 to create a new contact \n 2 to exit \n 3 to edit existing contact \n 4 to delete an existing contact \n 5 to sort contacts by Name");
            int choice = scanner.nextInt();
            if (choice == 1) {
                ContactInfo contact = new ContactInfo();
                contact.setContactInfo();
                name = contact.firstName.toUpperCase(Locale.ROOT) + " " + contact.lastName.toUpperCase(Locale.ROOT);
                multiAddressBook.get(key).addressBook.put(name, contact);
                multiAddressBook.get(key).addressBook.get(name).displayContactInfo();
            } else if (choice == 2) {
                is_Running = true;
            } else if (choice == 3) {
                multiAddressBook.get(key).editContact();
            } else if (choice == 4) {
                multiAddressBook.get(key).deleteContact();
            } else if (choice == 5) {
                sorting.sortContactsByPersonName(multiAddressBook);
            }
            }
        }

    /**
     * Method to delete an existing contact
     */
    public void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first and last name of the contact you want to delete from AddressBook: ");
        String name = scanner.nextLine().toUpperCase(Locale.ROOT);
        if (addressBook.containsKey(name)) {
            addressBook.remove(name);
            System.out.println("Contact removed");
        } else
            System.out.println("Contact not found");
    }
    /**
     * Method to edit an existing contact
     */
    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name and Last name  : ");
        String name = sc.nextLine().toUpperCase(Locale.ROOT);
        if (addressBook.containsKey(name)) {
            System.out.println("Enter the number you want to edit\n1.Address\n2.City\n3.State\n4.Zipcode\n5.Phone Number\n6.Email");
            int number = sc.nextInt();
            sc.nextLine();
            switch (number) {
                case 1 -> {
                    System.out.println("Enter new Address");
                    addressBook.get(name).setAddress(sc.nextLine());
                }
                case 2 -> {
                    System.out.println("Enter new City");
                    addressBook.get(name).setCity(sc.nextLine());
                }
                case 3 -> {
                    System.out.println("Enter new State");
                    addressBook.get(name).setState(sc.nextLine());
                }
                case 4 -> {
                    System.out.println("Enter new ZipCode");
                    addressBook.get(name).setZipcode(sc.nextLine());
                }
                case 5 -> {
                    System.out.println("Enter new Phone number");
                    addressBook.get(name).setPhoneNo(sc.nextLine());
                }
                case 6 -> {
                    System.out.println("Enter new Email");
                    addressBook.get(name).setEmail(sc.nextLine());
                }
                default -> System.out.println("Please input a valid number (1-6)");
            }
            addressBook.get(name).displayContactInfo();
        } else System.out.println("Contact not found");
    }
}
