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
}
