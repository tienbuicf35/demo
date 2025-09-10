package baitap;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            LibraryImpl obj = new LibraryImpl();
            // chạy trên cổng 2000 (tránh xung đột với 1099)
            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("Library", obj);
            System.out.println(">> Server đã sẵn sàng trên cổng 2000!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
