package duadimensi;

public class BelahKetupat {
    Double d1;
    Double d2;

    public BelahKetupat(Double inputD1, Double inputD2) {
        this.d1 = inputD1;
        this.d2 = inputD2;
    }

    public Double luas() {
        return  0.5 * d1 * d2;
    }
}