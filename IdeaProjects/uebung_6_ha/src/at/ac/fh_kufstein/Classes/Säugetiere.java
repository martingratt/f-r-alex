package at.ac.fh_kufstein.Classes;

/**
 * Created by marti on 21.12.2016.
 */
abstract class Säugetiere {
    private String name;
    private int alter;
    private char geschlecht;

    public abstract void printAll();

    public Säugetiere (String name, int alter, char geschlecht){
        this.setName(name);
        this.setAlter(alter);
        this.setGeschlecht(geschlecht);
    }

    public Säugetiere(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }
}
