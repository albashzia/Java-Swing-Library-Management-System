package Service;

import Code.ArrayListsManager;
import Code.Book;
import GUI.AdditionalClasses.CreateDialogBox;

import java.util.ArrayList;

public class BooksService {

    ArrayListsManager manager = ArrayListsManager.instance;
    ArrayList<Book> bookArrayList = manager.returnBooksArrayList();

    public boolean addBook(String id,String name,String author,int quantity){
        Book book = new Book(id,name,author,quantity);
        Boolean success = manager.addBook(book);
        if (success==true){
            CreateDialogBox dialogBox = new CreateDialogBox("Success", "Book Added Successfully");
        }
        else {
            success= false;
        }
        return success;
    }

    public void removeBook(String id){
        Book removableBook = null;
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getId().equalsIgnoreCase(id)){
                removableBook = bookArrayList.get(i);
            }
        }
        if(removableBook!=null){
            manager.removeBookById(removableBook);
        }
    }
}
