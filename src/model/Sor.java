package model;

import java.util.Random;
import java.util.UUID;

public class Sor {

    private static Random rnd = new Random();
    private static UUID randomizaltUUID = UUID.randomUUID();

    private UUID azonosito;
    private int malata;

    public Sor() {
        this(rnd.nextInt(50,76));
    }

    
    public Sor(int malata) {
        this.azonosito = randomizaltUUID;
        this.malata = malata;
    }

    @Override
    public String toString() {
        return "Sor{" + "azonosito=" + azonosito + ", malata=" + malata + '}';
    }
    
    

  
    
    
}
