package RMI.server;
import RMI.client.InterfaceRemota;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetoRemoto extends UnicastRemoteObject
        implements InterfaceRemota {
    /**
     * Constructor
     * @throws RemoteException
     */
    public ObjetoRemoto() throws RemoteException {
        super();
    }
    public int suma(int a, int b) {
        System.out.println("Sum called");
        return a + b;
    }
}