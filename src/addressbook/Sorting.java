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
                System.out.println(item.toString());
            }
        }
    }
}