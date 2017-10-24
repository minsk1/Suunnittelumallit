
package factorymethod;

/**
 *
 * @author minna
 */
public class Opettaja2 extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
      return new Limu();  
    };
    
}
