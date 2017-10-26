
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minna
 */
public class CompositeTietokone implements Tietokone {

    private List<Tietokone> childTietokone = new ArrayList<Tietokone>();
    
    @Override
    public int RakennaKone(){
        
        int x = 0;
        for (Tietokone tietokone : childTietokone){
            x += tietokone.RakennaKone();
            
            
        }
        System.out.println("Paketin yheissumma on: "+x+"€");
        return x;
    }
    
    public void add(Tietokone tietokone){
        childTietokone.add(tietokone);
    }
    
    public void remove(Tietokone tietokone){
        childTietokone.remove(tietokone);
    }
    
}
