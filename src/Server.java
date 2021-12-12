public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}
public Server() throws RemoteException {}

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();
public String reverse(String s) {
Character ch;
String ans="";
for (int i=0; i<s.length(); i++)
{
ch= s.charAt(i);
ans=ch+ans;
}
return ans ;
}

public Character minChar(String s){
char min = 'z';

for (int i=0; i<s.length()-1; i++)
if (s.charAt(i) < min)
min = s.charAt(i);

return min;
}

public String caseChanger(String s){

        java.rmi.registry.LocateRegistry.createRegistry(1250);
StringBuffer ans = new StringBuffer(s);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
for (int i=0; i<s.length(); i++)
if (Character.isLowerCase(s.charAt(i)))
ans.setCharAt(i, Character.toUpperCase(s.charAt(i)));
else ans.setCharAt(i, Character.toLowerCase(s.charAt(i)));

return ans.toString();
}

public static void main(String[] args) throws RemoteException, MalformedURLException {
Server server = new Server();

java.rmi.registry.LocateRegistry.createRegistry(1250);

Naming.rebind("rmi://127.0.0.1:1250/server", server);
}
}
