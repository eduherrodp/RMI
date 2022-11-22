package RMI.client;

import java.rmi.Naming;

public class Cliente
{
    public Cliente()
    {
        try {
            InterfaceRemota remoteObj =
                    (InterfaceRemota) Naming.lookup("//localhost/RemoteObj");
            System.out.println("Sum: " + remoteObj.suma(10, 20));
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        new Cliente();
    }
}