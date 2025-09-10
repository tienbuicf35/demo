package baitap;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Library extends Remote {
    Fraction cong(Fraction a, Fraction b) throws RemoteException;
}
