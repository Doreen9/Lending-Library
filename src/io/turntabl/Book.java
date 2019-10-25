package io.turntabl;

public class Book {

private String bookName;
private int ISBN;
private String author;
private Category category;
private State state;

    @Override
    public String toString(){
        return "Book name: " + bookName +
                "Book ISBN: " + ISBN +
                "Category: " + category +
                "State: " + state;
    };

    public Book(String bookName, int ISBN, String author, Category category, State state) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.category = category;
        this.author = author;
        this.state = state;
    };


    public String getBookName() {
        return bookName;
    }

    public int getISBN() {
        return ISBN;
    }

    public Category getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public State getState() {
        return state;
    }


}

