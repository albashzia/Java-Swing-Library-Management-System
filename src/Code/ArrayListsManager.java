package Code;

import java.util.ArrayList;

public class ArrayListsManager {

    public static ArrayListsManager instance = new ArrayListsManager();
    ArrayList<Integer> bookIds;
    ArrayList<String> bookTitles;
    ArrayList<String> bookAuthors;
    ArrayList<Integer> booksQuantity;

    public ArrayListsManager(){
        bookIds = new ArrayList<Integer>();
        bookTitles = new ArrayList<String>();
        bookAuthors = new ArrayList<String>();
        booksQuantity = new ArrayList<Integer>();
    }

    public void addBook(int id, String title, String author, int quantity){
        bookIds.add(id);
        bookTitles.add(title);
        bookAuthors.add(author);
        booksQuantity.add(quantity);
    }

    public void displayAddedBooks(){
        for (int i = 0; i < bookIds.size();i++){
            System.out.println(bookIds.get(i));
            System.out.println(bookTitles.get(i));
            System.out.println(bookAuthors.get(i));
            System.out.println(booksQuantity.get(i));
        }
    }

    // Fetching data, returning array lists for DisplayBookFrame class
    public ArrayList<Integer> fetchIdsData(){
        return bookIds;
    }
    public ArrayList<String> fetchTitlesData(){
        return bookTitles;
    }
    public ArrayList<String> fetchAuthorsData(){
        return bookAuthors;
    }
    public ArrayList<Integer> fetchQuantityData(){
        return booksQuantity;
    }

}
