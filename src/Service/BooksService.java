package Service;

import Code.ArrayListsManager;
import Code.Book;
import GUI.AdditionalClasses.CreateDialogBox;

public class BooksService {

    ArrayListsManager manager = ArrayListsManager.instance;

    public void addBook(String id,String name,String author,int quantity){
        Book book = new Book(id,name,author,quantity);
        manager.addBook(book);
        CreateDialogBox dialogBox = new CreateDialogBox("Success", "Book Added Successfully");
    }
}
