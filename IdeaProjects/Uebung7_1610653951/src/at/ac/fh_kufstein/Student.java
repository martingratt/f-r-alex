package at.ac.fh_kufstein;

/**
 * Created by marti on 17.01.2017.
 */
public class Student {
    private String name;
    private String matklnr;
    private String Jahrgang;

    public String toString(){
        return "Name: "+this.getName()+", Jahrgang: "+this.getJahrgang()+", Martikelnummer: " +this.getMatklnr();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatklnr() {
        return matklnr;
    }

    public void setMatklnr(String matklnr) {
        this.matklnr = matklnr;
    }

    public String getJahrgang() {
        return Jahrgang;
    }

    public void setJahrgang(String jahrgang) {
        Jahrgang = jahrgang;
    }
}
