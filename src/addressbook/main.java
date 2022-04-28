package addressbook;
import javax.naming.Name;
import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.jar.Attributes;
public class main
{
    public static void main(String[] arys)
    {
        ArrayList<systembook> info = new ArrayList<>();
        //info.add(new systembook(Name:"mahesh"));
        System.out.println("\nsystembook Info");
        System.out.println();
        System.out.printf("%1s%15\n"+"name"+"phonenumber\n");
        System.out.println();
        for (systembook ph : info)
        {
            System.out.println("%1s%15\n"+ ph.getName()+ ph.getPhonenumber());
        }
    }
}

