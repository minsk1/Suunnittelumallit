/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author minna
 */
public class Jalapeno extends PizzaDecorator{
    
    public Jalapeno(Pizza lisattavaAines) {
        super(lisattavaAines);
    }
    
    @Override
    public int getHinta() {
        return super.getHinta() + 1;
    }

    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " jalapeno ";
    }
    
}
