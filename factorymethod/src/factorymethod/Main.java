package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        AterioivaOtus opettaja2 = new Opettaja2();
        opettaja2.aterioi();
        
        AterioivaOtus oppilas = new Oppilas();
        oppilas.aterioi();
    }
}
