
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import java.util.List;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Emolevy emolevy = new Emolevy();
        Kotelo kotelo = new Kotelo();
        Muistipiiri muistipiiri = new Muistipiiri();
        Näytönohjain näytönohjain = new Näytönohjain();
        Prosessori prosessori = new Prosessori();
        Verkkokortti verkkokortti = new Verkkokortti();

        CompositeTietokone tietokone = new CompositeTietokone();
        
        tietokone.add(emolevy);
        tietokone.add(kotelo);
        tietokone.add(muistipiiri);
        tietokone.add(näytönohjain);
        tietokone.add(prosessori);
        tietokone.add(verkkokortti);
        
        tietokone.RakennaKone();
        
        // tässä alapuolella tehtaan jutut (bonus) ei toimi vielä
        
        AbstractFactory factory = null;
        
        factory = new msiFactory();
        
        Tietokone tietokoneTehtaasta = factory.createKovalevy();
        
        tietokoneTehtaasta.RakennaKone();
        
        ArrayList<Integer> Lista = new ArrayList<Integer>();
        
        System.out.println(Lista);
        
    }
    
}
