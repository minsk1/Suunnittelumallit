package AF;

/**
 *
 * @author minna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        AbstractiTehdas factory = null;

        final String appearance = randomAppearance();	// Current operating system

        if (appearance.equals("Boss")) {
            factory = new BossFactory() {};
        } else if (appearance.equals("Addu")) {
            factory = new AdduFactory();

        }

        final Paita paita = factory.createPaita();
        final Housut housut = factory.createHousut();
        final Lippis lippis = factory.createLippis();
        final Kengat kengat = factory.createKengat();
        
        paita.puePaita();
        housut.pueHousut();
        kengat.pueKengat();
        lippis.pueLippis();

    }


    public static String randomAppearance() {
        final String[] appearanceArray = new String[2];

        appearanceArray[0] = "Boss";
        appearanceArray[1] = "Addu";
        final java.util.Random random = new java.util.Random();

        final int randomNumber = random.nextInt(2);

        return appearanceArray[randomNumber];
    }

}
