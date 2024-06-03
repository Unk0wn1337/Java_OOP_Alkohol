package model;

public class Bor {

  
   private String tipus;

    private Bor(String tipus) throws Exception {
        tipusBeallitas(tipus);
    }

    private void tipusBeallitas(String tipus) throws Exception {
        if(tipus == "szaraz" || tipus == "edes"){
            this.tipus = tipus;
        } else {
            throw new Exception("HIBA: a tipus csak szaraz vagy edes lehet");
        }
    }



}
