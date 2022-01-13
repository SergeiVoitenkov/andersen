package task03.akhmetkhanov.creational.prototype;

import java.util.Objects;

public class Book implements Copyable {
    private String name;
    private String author;
    private int pages;
    private int yearPublished;
    private Genre genre;

    public Book(String name, String author, int pages, int yearPublished, Genre genre) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.yearPublished = yearPublished;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", published=" + yearPublished +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages
                && name.equals(book.name)
                && author.equals(book.author)
                && Objects.equals(yearPublished, book.yearPublished)
                && genre == book.genre;
    }

    @Override
    public Object copy() {
        return new Book(name, author, pages, yearPublished, genre);
    }
}
