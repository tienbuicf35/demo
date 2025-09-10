package baitap;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class LibraryImpl extends UnicastRemoteObject implements Library {
    protected LibraryImpl() throws RemoteException {
        super();
    }

    @Override
    public Fraction cong(Fraction a, Fraction b) throws RemoteException {
        int tu = a.getTu() * b.getMau() + b.getTu() * a.getMau();
        int mau = a.getMau() * b.getMau();
        return new Fraction(tu, mau);
    }
}
