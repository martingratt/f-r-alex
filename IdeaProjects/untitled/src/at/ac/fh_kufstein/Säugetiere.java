package at.ac.fh_kufstein;

/**
 * Created by marti on 17.12.2016.
 */
abstract class Säugetiere {

    public abstract void printAll();

    private String name; //public?
    private int alter;
    private char geschlecht;


    public Säugetiere (String name, int alter, char geschlecht){
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
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
