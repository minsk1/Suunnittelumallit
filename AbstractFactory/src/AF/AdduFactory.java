/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AF;

/**
 *
 * @author minna
 */
public class AdduFactory implements Pue {

    @Override
    public Housut createHousut(){
        return (Housut) new AdduHousut();
    }

    @Override
    public Paita createPaita() {
        return (Paita) new AdduPaita();
    }

    @Override
    public Paita paita() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
