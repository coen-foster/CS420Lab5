import java.rmi.RemoteException;

public class Process implements Process_Interface {
    private long localClock;
    private final TimeServer_Interface timeServer;

    public Process(TimeServer_Interface timeServer) {
        this.timeServer = timeServer;
        this.localClock = System.currentTimeMillis();
    }

    @Override
    public void synchronize() throws RemoteException {
        long serverTime = timeServer.getTime();
        long offset = serverTime - localClock;
        localClock += offset;
        System.out.println("Local clock adjusted by " + offset + " ms. New time: " + localClock);
    }
}
