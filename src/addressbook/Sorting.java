package com.bridgelabzz;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Sorting {
    public void sortContactsByPersonName(HashMap<String, AddressBook> multipleAddressBook) {
        for (Map.Entry<String, AddressBook> addressBookMapEntry : multipleAddressBook.entrySet()) {
            List<ContactInfo> sortedContacts = addressBookMapEntry.getValue().addressBook.values().stream().sorted(Comparator.comparing(contactInfo -> contactInfo.firstName + contactInfo.lastName)).collect(Collectors.toList());
            System.out.println("Sorted Contacts By Name : ");
            for (ContactInfo item : sortedContacts) {
                System.out.println(item.getFirstName() + " " + item.getLastName());
            }
        }
    }
    public void sortContactsByCity(HashMap<String, AddressBook> multipleAddressBook) {
        for (Map.Entry<String, AddressBook> addressBookMapEntry : multipleAddressBook.entrySet()) {
            List<ContactInfo> sortedContacts = addressBookMapEntry.getValue().addressBook.values().stream().sorted(Comparator.comparing(contactInfo -> contactInfo.city)).collect(Collectors.toList());
            System.out.println("Sorted Contacts By City : ");
            for (ContactInfo item : sortedContacts) {
                System.out.println(item.getCity() + " ");
            }
        }
    }
    public void sortContactsByZip(HashMap<String, AddressBook> multipleAddressBook) {
        for (Map.Entry<String, AddressBook> addressBookMapEntry : multipleAddressBook.entrySet()) {
            List<ContactInfo> sortedContacts = addressBookMapEntry.getValue().addressBook.values().stream().sorted(Comparator.comparing(contactInfo -> contactInfo.zipcode)).collect(Collectors.toList());
            System.out.println("Sorted Contacts By Zip : ");
            for (ContactInfo item : sortedContacts) {
                System.out.println(item.getZipcode() + " ");
            }
        }
    }
    public void sortContactsByState(HashMap<String, AddressBook> multipleAddressBook) {
        for (Map.Entry<String, AddressBook> addressBookMapEntry : multipleAddressBook.entrySet()) {
            List<ContactInfo> sortedContacts = addressBookMapEntry.getValue().addressBook.values().stream().sorted(Comparator.comparing(contactInfo -> contactInfo.state)).collect(Collectors.toList());
            System.out.println("Sorted Contacts By State : ");
            for (ContactInfo item : sortedContacts) {
                System.out.println(item.getState() + " ");
            }
        }
    }





}