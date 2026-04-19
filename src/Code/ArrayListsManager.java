package Code;

import java.util.ArrayList;

public class ArrayListsManager {
    ArrayList<Integer> bookId;
    ArrayList<String> bookTitle;
    ArrayList<String> bookAuthors;
    ArrayList<Integer> booksQuantity;

    public ArrayListsManager(){
        bookId = new ArrayList<Integer>();
        bookTitle = new ArrayList<String>();
        bookAuthors = new ArrayList<String>();
        booksQuantity = new ArrayList<Integer>();
    }

    public void addBook(int id, String title, String author, int quantity){
        bookId.add(id);
        bookTitle.add(title);
        bookAuthors.add(author);
        booksQuantity.add(quantity);
    }
}
