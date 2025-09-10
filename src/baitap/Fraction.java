package baitap;
import java.io.Serializable;

public class Fraction implements Serializable {
    private int tu, mau;

    public Fraction(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    public int getTu() { return tu; }
    public int getMau() { return mau; }

    private void rutGon() {
        int g = gcd(Math.abs(tu), Math.abs(mau));
        tu /= g;
        mau /= g;
        if (mau < 0) { tu = -tu; mau = -mau; }
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
