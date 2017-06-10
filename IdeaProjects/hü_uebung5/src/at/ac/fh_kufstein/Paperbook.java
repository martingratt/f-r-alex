package at.ac.fh_kufstein;

/**
 * Created by marti on 28.01.2017.
 */
public class Paperbook extends Book{
    private String series;
    private String month;
    private final String isbn = "00000-000000-0000";


    public Paperbook(){}

    Paperbook(String series, int pages, String month, String isbn){
        super();
        this.setSeries(series);
        this.setPages(pages);
        this.setMonth(month);
        this.setIsbn(isbn);




    }

    public  void ausgabepaperbook(){
        System.out.println(this.getSeries()+" hat " +getPages()+" Seiten und folgende ISBN: " + getIsbn() +" zusätzlich ist es im Monat "+ getMonth() +" erschienen.");
    }




    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }
}
