package addressbook;
import javax.naming.Name;
import java.util.ArrayList;
public class systembook {
    private String name;
    private String phonenumber;
    public systembook() {
    }
    public systembook(String name, String phone_no) {
        this.name = name;
        this.phonenumber = phone_no;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public class main {
        public static void main(String[] arys) {
            ArrayList<systembook> info = new ArrayList<>();
            info.add(new systembook(  "mahesh","6303186275"));
            System.out.println("\nsystembook Info");
            System.out.println();
            System.out.printf("%1s%15\n" + "name" + "phonenumber\n");
            System.out.println();
            for (systembook ph : info)
            {
                System.out.println("%1s%15\n"+ ph.getName() + ph.getPhonenumber());
            }
        }
    }
}