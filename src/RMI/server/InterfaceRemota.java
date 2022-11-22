package RMI.server;

import java.rmi.*;

public interface InterfaceRemota extends Remote
{
    int suma(int a, int b) throws RemoteException;
}
