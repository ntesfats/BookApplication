import java.util.HashMap;

public class BookDataBase {
    private HashMap<String, Book> dataBase;

    public BookDataBase(){
        dataBase = new HashMap<String, Book>();
    }

    public void addBook(String SKU, Book book){
        if (dataBase.containsKey(SKU)) System.out.printf("A book with %s SKU already exists in DataBase.\n", SKU);
        else dataBase.put(SKU, book);
    }

    public Book getBook(String SKU){
        if (!dataBase.containsKey(SKU)) {
            System.out.printf("A Book with %s SKU does not exists in DataBase\n", SKU);
            return null;
        }
        return dataBase.get(SKU);
    }
}

