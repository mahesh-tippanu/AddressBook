package addressbook;
import java.util.ArrayList;
import java.util.Scanner;
public class addperson_details
{
    static ArrayList<Contacts> addpersondetails = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Contacts contacts = new Contacts();
    public void addDetails()
    {
        Contacts info = new Contacts();
        System.out.println("Enter the First name: ");
        info.setFirstName(sc.next());
        System.out.println("Enter the last name: ");
        info.setLastName(sc.next());
        System.out.println("Enter Address: ");
        info.setAddress(sc.next());
        System.out.println("Enter the city");
        info.setCity(sc.next());
        System.out.println("Enter the State name: ");
        info.setState(sc.next());
        System.out.println("Enter the pincode: ");
        info.setPincode(sc.next());
        System.out.println("Enter the contact no: ");
        info.setContact_no(sc.next());
        System.out.println("Enter Email: ");
        info.setEmail(sc.next());
        addpersondetails.add(info);
    }
    public void Displayaddpersondetails()
    {
        System.out.println(addpersondetails);
    }
    public void editDetails(String searchFirstName)
    {
        for (Contacts contact : addpersondetails)
        {
            System.out.println("First name: "+contact.getFirstName());
            if (contact.getFirstName().equals(searchFirstName)){
                System.out.println("Enter the number to edit respective info: ");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City " +
                        "\n5. State \n6. Zip Code \n7. Contact No \n8. Email");
                int index = sc.nextInt();
                System.out.println("Enter value to update: ");
                switch (index){
                    case 1:
                        String updatedFirstName = sc.next();
                        contact.setFirstName(updatedFirstName);
                        break;
                    case 2:
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                        break;
                    case 3:
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                        break;
                    case 4:
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                        break;
                    case 5:
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                        break;
                    case 6:
                        String updatedpincode = sc.next();
                        contact.setPincode(updatedpincode);
                        break;
                    case 7:
                        String updatedContact_no = sc.next();
                        contact.setContact_no(updatedContact_no);
                        break;
                    case 8:
                        String updatedEmail = sc.next();
                        contact.setEmail(updatedEmail);
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
            }
            else {
                System.out.println("No record found!");
            }
        }
    }
    public static void main(String[] args) {
        Addressbookperson addressofperson1 = new Addressbookperson();
        addressofperson1.Displaydetails();
        addressofperson1.editDetails();
    }
}
