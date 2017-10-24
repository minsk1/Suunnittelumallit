
package factorymethod;

/**
 *
 * @author minna
 */
public class Oppilas extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Viini();
    };
    
}

