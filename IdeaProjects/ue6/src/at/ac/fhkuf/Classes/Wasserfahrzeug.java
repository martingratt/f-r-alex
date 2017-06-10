package at.ac.fhkuf.Classes;

import java.lang.Thread;

/**
 * Created by martinschipflinger on 15.12.16.
 */
public class Wasserfahrzeug extends Fahrzeug {
    private double tiefgang;
    private short schrauben;
    private double ladung;


    public Wasserfahrzeug(short reifen, String farbe, int ps, short tueren, double tiefgang, short schrauben, double ladung){
        this.setReifen(reifen);
        this.setFarbe(farbe);
        this.setPs(ps);
        this.setTueren(tueren);
        this.setGestarted(false);
        this.setGeschwindigkeit((short)0);
        this.setTiefgang(tiefgang);
        this.setSchrauben(schrauben);
        this.setLadung(ladung);

        Fahrzeug.setAnzahl(Fahrzeug.getAnzahl() + 1);
    }

    public void entladen(){
        if(this.getLadung() > 0){
            this.setLadung(0);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString(){
        return String.format("Mein Wasserfahrzeug hat %1$d PS und einen Tiefgang von %2$.3f m", this.getPs(), this.getTiefgang());
    }

    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }
}
