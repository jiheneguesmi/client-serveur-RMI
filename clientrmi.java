import java.rmi.*;

public class clientrmi {
    public static void main(String[] args) {
        try {
            // Recherche du serveur RMI
            ServerInterface obj = (ServerInterface) Naming.lookup("//localhost/Server");

            // Appel de la méthode distante
            String result = obj.convertString("Hello, world!");
            System.out.println("Result from server: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
