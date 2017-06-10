package at.ac.fh_kufstein;


/**
 * Created by marti on 27.01.2017.
 */
public class Student {
    private String vorname;
    private String nachname;

    Student(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;


    }

    public void nameaufrufen(String vorname, String nachname){
        System.out.println(this.getVorname());
        System.out.println(this.getnachname());
    }

    public static void einszweioderdrei(int a){
        switch (a){
            case 1:
                System.out.println("Die eingegebene Zahl ist 1");
                break;
            case 2:
                System.out.println("Die eingegebene Zahl ist 2");
                break;
            case 3: System.out.println("Die eingegebene Zahl ist 3");
                break;
            default:
                System.out.println("Die eingegebene Zahl ist weder 1, 2 oder 3");
                break;
        }


    }



    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getnachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }


}

