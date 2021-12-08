package tigadimensi;
import duadimensi.Persegi;

public class Kubus extends Persegi{
    
    Kubus(Double sisi){
        super(sisi);
    }

    Double volume(){
        return super.luas() * lebar;
    }
}
