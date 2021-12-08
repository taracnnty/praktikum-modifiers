package duadimensi;

public class Lingkaran {
    Double jari;
    Double phi = 3.14;

    public Lingkaran(Double jari) {
        this.jari = jari;
    }

    public Double luas() {
        return  jari * jari * phi;
    }
}
