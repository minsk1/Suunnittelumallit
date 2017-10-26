
package AF;

/**
 *
 * @author minna
 */
public class BossFactory implements AbstractiTehdas {
    
    @Override
    public Housut createHousut(){
        return (Housut) new BossHousut();
    }

    @Override
    public Paita createPaita() {
        return (Paita) new BossPaita();
    }

    @Override
    public Kengat createKengat() {
       return (Kengat) new BossKengat();
    }

    @Override
    public Lippis createLippis() {
        return (Lippis) new BossLippis();
    }


    
}
