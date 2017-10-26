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
public class AdduFactory implements AbstractiTehdas {

    @Override
    public Housut createHousut() {
        return (Housut) new AdduHousut();
    }

    @Override
    public Paita createPaita() {
        return (Paita) new AdduPaita();
    }

    @Override
    public Lippis createLippis() {
        return (Lippis) new AdduLippis();
    }

    @Override
    public Kengat createKengat() {
        return (Kengat) new AdduKengat();
    }
}
