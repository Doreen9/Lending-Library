package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Book> books = Arrays.asList( new Book("Worry child", 1234,  "Ama Aidoo", Category.FICTION, State.AVAILABLE)
        , new Book("Gone with the wind", 1034,  "Julia Roberts", Category.ROMANTIC, State.LOST)
        , new Book("Stranger things", 1114,  "Alex Adams", Category.FICTION, State.AVAILABLE)
        , new Book("In the woods", 1255,  "James Chang", Category.ADVENTURE, State.AVAILABLE)
        , new Book("Lost", 1334,  "Steve Smith", Category.ROMANTIC, State.AVAILABLE)
        , new Book("Monster Blood", 1674,  "R.L STINE", Category.FICTION, State.AVAILABLE)
        , new Book("game of thrones", 5634, "George Arthur", Category.ADVENTURE, State.BORROWED));

        List<Borrower> people = Arrays.asList( new Borrower("Angelina Amengu", "12/10/2017", "15:00", BorrowerType.PREMIUM)
        , new Borrower("Robert Smith", "13/06/2018", "12:00", BorrowerType.GOLD)
        , new Borrower("Agatha Johns", "23/05/2016", "13:30", BorrowerType.REGULAR)
        , new Borrower("David Smooth", "31/01/2019", "16:10", BorrowerType.GOLD)
        , new Borrower("Christiana Asare", "15/04/2018", "20:00", BorrowerType.PREMIUM)
        , new Borrower("William James", "15/02/2018", "10:20", BorrowerType.REGULAR)
        , new Borrower("Belinda Brown", "17/06/2018", "18:50", BorrowerType.GOLD)
        , new Borrower("Daniel Strong", "13/04/2019", "14:10", BorrowerType.PREMIUM)
        , new Borrower("Amanda Williams", "13/01/2017", "12:45", BorrowerType.GOLD)
        , new Borrower("John Sams", "10/07/2019", "19:00", BorrowerType.CHILDREN));

        List<Book> allBooks = new ArrayList<>();

        List<Borrower> lendees = new ArrayList<>();

        for(Book book: books){
           if(book.getCategory() == Category.FICTION){
               allBooks.add(book);
           }
        }
        for(Borrower person: people){
            if(person.getType() == BorrowerType.GOLD){
                lendees.add(person);
            }
        }

        printBooks(allBooks);
        System.out.println();
        printBorrower(lendees);
    }

    private static void printBooks(List<Book> allBooks){
        System.out.println("Names of books of type fiction: ");
        for(Book book: allBooks){
            System.out.println(book.getBookName());
        }
    }

    private static void printBorrower(List<Borrower> lendees){
        System.out.println("Names of Borrowers with a GOLD type: ");
        for(Borrower person: lendees){
            System.out.println(person.getBorrowerName());
        }
    }



}
