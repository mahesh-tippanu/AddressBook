package addressbook;
import javax.naming.Name;
import java.util.ArrayList;
public class systembook {
    private String firstname,lastNmae,address,city,state,pincode,contactno,email;
    public systembook(string fname,string lname,
                      string address,string cityname,string state,string pincode,
                      string contact_No,string email_id){
    }
        this.firstname = fname;
        this.lastname = lName;
        this.address = address;
        this.city = cityName;
        this.state = state;
        this.PipCode = PinCode;
        this.contactNo = contact_No;
        this.email = email_id;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public void setfirstName(String firstname) {
        this.firstname = firstname;
    }
        public class systembookMain {
        public static void main(String[] arys) {
            System.out.println("Welcome to Address book");
            contacts contacts_no = new contact_no("madhukar","tatiraju","gurdavara","viazg","AP","530040",""6303301745","madhukar@gmail.com"                                         
            System.out.println(contact_no.getFirstName());
            System.out.println(contacts.getEmail_id());       
        }
    }
}
