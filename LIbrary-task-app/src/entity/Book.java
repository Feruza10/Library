package entity;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;

    private Double prise;

    private String data;

    private String author;

    public Book(String name, Double prise, String data, String author) {
        this.name = name;
        this.prise = prise;
        this.data = data;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addBook(Book book) {
        List<Book>bookList = new ArrayList<>();
        bookList.add(book);
    }
}
