package addressbook;
import java.util.ArrayList;
import java.util.Scanner;
public class addperson_details {
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
        addperson_details.addpersondetails(Contacts);
    }

    public void Displayaddpersondetails() {
        System.out.println(addperson_details);
    }

    public static void main(String[] args) {
        systembook addressofperson1 = new systembook();
        addressofperson1.()addperson_details;
        addressofperson1.()Displayaddpersondetails;
    }
}
