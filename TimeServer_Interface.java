import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TimeServer_Interface extends Remote {
    long getTime() throws RemoteException;
}