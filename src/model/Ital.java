
package model;




public class Ital extends Bor, Sor{
    public enum cimke {
        REGI,
        UJ,
        HAGYOMANYOS
    };
    
    private cimke cim;
    private String nev;
    private double fok;

    
    public Ital(cimke cim, String nev, double fok) {
        setCim(cim);
        setNev(nev);
        setFok(fok);
        
    }

    public void setCim(cimke cim) {
        switch(cim){
            case REGI:
                this.cim = cimke.REGI;
                break;
            case HAGYOMANYOS:
                this.cim = cimke.HAGYOMANYOS;
                break;
            case UJ:
                this.cim = cimke.UJ;
                break;
        }
    }

    public void setNev(String nev) {
        this.nev = nev;
        
    }

    public void setFok(double fok) {
        this.fok = fok;
    }

    @Override
    public String toString() {
        return "Ital{" + "cim=" + cim + ", nev=" + nev + ", fok=" + fok + "%"  + '}';
    }
    
    
    
    

}
