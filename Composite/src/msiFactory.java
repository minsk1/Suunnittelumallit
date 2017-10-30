/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minna
 */
public class msiFactory implements AbstractFactory {

    @Override
    public Tietokone createKovalevy() {
        return new msiKovalevy();
    }
    
    
}
