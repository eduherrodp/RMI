package RMI.server;

import RMI.client.InterfaceRemota;

import java.rmi.*;

public class Servidor
{
    public Servidor() {
        try
        {
            System.setProperty(
                    "java.rmi.server.codebase",
                    "file://C:/Users/eduhe/OneDrive/Desktop/RMI/src/RMI/server/");
            InterfaceRemota objetoRemoto = new ObjetoRemoto();
            Naming.rebind("//localhost/ObjetoRemoto", objetoRemoto);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * @param args command line arguments
     */

    public static void main(String[] args)
    {
        new Servidor();
    }
}

