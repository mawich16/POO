package aula10;

import java.util.Objects;

public class Book {

    String title, author;
    int year;

    public Book(String title, String author, int year) {
        this.title=title;
        this.author=author;
        this.year=year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }


    public void setAuthor (String author) {
        this.author=author;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public void setYear(int year) {
        this.year=year;
    }

    public String toString() {
        return String.format("%s de %s, %d", title, author, year);
    }

    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}

