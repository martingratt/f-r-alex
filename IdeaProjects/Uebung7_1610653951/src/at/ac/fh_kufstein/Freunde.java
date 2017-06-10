package at.ac.fh_kufstein;

/**
 * Created by marti on 16.01.2017.
 */




public class Freunde {
    private String name;



    @Override
    public String toString(){
        return this.getName();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
