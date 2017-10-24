
package AF;

/**
 *
 * @author minna
 */
public class BossFactory implements Pue {
    
    @Override
    public Housut createHousut(){
        return (Housut) new BossHousut();
    }

    @Override
    public Paita createPaita() {
        return (Paita) new BossPaita();
    }

    @Override
    public Paita paita() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
