package Code;

import java.io.File;

public class FileManager {
    static String BOOKS_DATA_FILE = "books_data.txt";
    static String ISSUED_BOOKS_DATA_FILE = "issued_data.txt";
    static String MEMBERS_DATA_FILE = "members.txt";
    static String ROOMS_DATA_FILE = "rooms.txt";

    static void loadBooks(){
        File file = new File(BOOKS_DATA_FILE);
    }
}
