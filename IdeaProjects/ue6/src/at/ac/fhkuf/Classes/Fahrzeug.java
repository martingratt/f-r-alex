package at.ac.fhkuf.Classes;

/**
 * Created by martinschipflinger on 15.12.16.
 */
public class Fahrzeug {
    private short reifen;
    private String farbe;
    private int ps;
    private short tueren;
    private boolean gestarted;
    private short geschwindigkeit;

    private static int anzahl;


    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }

    public void starten(){
        if(!isGestarted()){
            this.setGestarted(true);
        }
    }

    public void stoppen(){
        if(isGestarted()){
            this.setGestarted(false);
        }
    }

    public void beschleunigen(short erhoehung){
        if(this.isGestarted() && this.getGeschwindigkeit()+erhoehung <=250){
            this.setGeschwindigkeit((short) (this.getGeschwindigkeit() + erhoehung));
        } else if (! this.isGestarted() && this.getGeschwindigkeit()+erhoehung <=250) {
            this.starten();
            this.setGeschwindigkeit((short) (this.getGeschwindigkeit() + erhoehung));
        } else {
            this.setGeschwindigkeit((short)250);
        }
    }

    public void bremsen(short verringerung){
        if(this.isGestarted() && this.getGeschwindigkeit()-verringerung >= 0){
            this.setGeschwindigkeit((short)(this.getGeschwindigkeit()-verringerung));
        } else{
            this.setGeschwindigkeit((short) 0);
        }
    }


    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean isGestarted() {
        return gestarted;
    }

    public void setGestarted(boolean gestarted) {
        this.gestarted = gestarted;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }
}
