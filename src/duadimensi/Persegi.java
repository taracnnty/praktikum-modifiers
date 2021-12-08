package duadimensi;

public class Persegi {
    public Double lebar;

    public Persegi(Double inputLebar) {
        this.lebar = inputLebar;
    }

    public Double luas() {
        return lebar * lebar;
    }
}
