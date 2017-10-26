
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
    }
    
}
