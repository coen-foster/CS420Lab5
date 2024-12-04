import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Process_Interface extends Remote {
    void synchronize() throws RemoteException;
}