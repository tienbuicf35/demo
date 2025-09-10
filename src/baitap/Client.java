package baitap;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // kết nối tới server trên localhost:2000
            Registry registry = LocateRegistry.getRegistry("localhost", 2000);
            Library stub = (Library) registry.lookup("Library");

            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tử số phân số 1: ");
            int t1 = sc.nextInt();
            System.out.print("Nhập mẫu số phân số 1: ");
            int m1 = sc.nextInt();

            System.out.print("Nhập tử số phân số 2: ");
            int t2 = sc.nextInt();
            System.out.print("Nhập mẫu số phân số 2: ");
            int m2 = sc.nextInt();

            Fraction f1 = new Fraction(t1, m1);
            Fraction f2 = new Fraction(t2, m2);

            Fraction result = stub.cong(f1, f2);

            System.out.println("Kết quả: " + f1 + " + " + f2 + " = " + result);

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
