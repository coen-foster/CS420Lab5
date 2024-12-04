import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            TimeServer_Interface timeServer = (TimeServer_Interface) Naming.lookup("rmi://localhost/TimeServer");
            Process_Interface process = new Process(timeServer);

            System.out.println("Initial local clock: " + System.currentTimeMillis());
            Thread.sleep(10);
            process.synchronize();
            Thread.sleep(100);
            process.synchronize();
        } catch (Exception e) {
            System.err.println("Process exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}