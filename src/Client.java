import java.rmi.Naming;
import java.util.*;

public class Client {

    public static void main(String[] args) {
        try {
           MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
public static void main(String[] args) {
try {
MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
Scanner obj = new Scanner(System.in);
String s = obj.nextLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
System.out.println(service.caseChanger(s));

obj.close();

} catch (Exception e) {
e.printStackTrace();
}
}
}
