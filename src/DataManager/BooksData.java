package DataManager;

import Code.Book;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BooksData {

    File bookFile = new File("AllBooks.ser");
    public BooksData(){

    }

    public void saveData(ArrayList<Book> bookArrayList){
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(bookFile));
            objectOutputStream.writeObject(bookArrayList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
