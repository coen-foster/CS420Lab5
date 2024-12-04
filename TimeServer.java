import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TimeServer extends UnicastRemoteObject implements TimeServer_Interface {
    private static final long serialVersionUID = 1L;

    public TimeServer() throws RemoteException {
    }

    @Override
    public long getTime() throws RemoteException {
        return System.currentTimeMillis();
    }
}