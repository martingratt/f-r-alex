package at.ac.fhkuf.Classes;

/**
 * Created by martinschipflinger on 15.12.16.
 */
public class Auto extends Fahrzeug {
    private boolean klimaanlage;
    private short airbags;

    public Auto(short reifen, String farbe, int ps, short tueren, short airbags){
        this.setReifen(reifen);
        this.setFarbe(farbe);
        this.setPs(ps);
        this.setTueren(tueren);
        this.setGestarted(false);
        this.setGeschwindigkeit((short)0);
        this.setKlimaanlage(false);
        this.setAirbags(airbags);

        Fahrzeug.setAnzahl(Fahrzeug.getAnzahl() + 1);
    }

    public void klimaanlageAn(){
        if(this.isKlimaanlage()){
            System.out.println("Die Klimaanlage läuft bereits!");
        } else {
            this.setKlimaanlage(true);
        }
    }

    public void klimaanlageAus(){
        if(this.isKlimaanlage()){
            this.setKlimaanlage(false);
        } else {
            System.out.println("Die Klimaanlage ist bereits aus!");
        }
    }

    @Override
    public String toString(){
        return String.format("Mein Auto hat %1$d PS und fährt mit %2$d km/h",this.getPs(),this.getGeschwindigkeit());
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
}
