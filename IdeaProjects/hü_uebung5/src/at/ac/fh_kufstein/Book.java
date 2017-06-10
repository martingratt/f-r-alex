package at.ac.fh_kufstein;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by marti on 28.01.2017.
 */
public class Book {
    private int pages;
    private Date released;
    private String title;
    String isbn;

    public Book(){}


    Book (int pages,String dateString, String title, String isbn){
        this.setPages(pages);
        this.setReleased(formatDate(dateString));
        this.setTitle(title);
        this.setIsbn(isbn);
    }



    private Date formatDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date tmpDate = new Date();

        try {
            tmpDate = format.parse(date);
        } catch (ParseException e) {
            System.err.println("Das übergebene Datum kann nicht formatiert werden. Bitte überprüfen Sie das Format (dd.MM.yyy)");
            e.printStackTrace();
        }

        return tmpDate;
    }

    public void ausgabeInsanz() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Das Buch hat " + this.getPages() + " Seiten, wurde am " + format.format(this.getReleased()) + " veröffentlicht und hat den Titel " + this.getTitle());
    }

    public void ausgabearray(){
        System.out.println(this.getTitle()+" hat "+this.getPages()+" Seiten und folgende ISBN: "+this.getIsbn());
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}
