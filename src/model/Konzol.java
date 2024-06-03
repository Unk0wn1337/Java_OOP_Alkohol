

package model;
import model.Bor;
import model.Sor;



public class Konzol extends Bor {
    Sor[] sorok;
    Bor[] borok;

    
    public Konzol(Sor[] sorok, Bor[] borok, String tipus) throws Exception {
        super(tipus);
        setSorok(sorok);
        setBorok(borok);
        
    }

    public void setSorok(Sor[] sorok) {
        this.sorok = new Sor[]{
            new Sor(63), new Sor(), new Sor(), new Sor(), new Sor(), new Sor()
        };
        
    }

    public void setBorok(Bor[] borok) throws Exception {
        this.borok = new Bor[]{
            new Bor("szaraz"), new Bor("edes"), new Bor("szaraz"), new Bor("szaraz"), new Bor("edes")
        };
    }
    
}
