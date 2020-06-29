public class BookApp {
    public static void main(String[] args){
        Book book1 = new Book("The Hunger Games", "Suzanne Collins",
                "In the ruins of a place once known as North America lies the " +
                        "nation of Panem, a shining Capitol surrounded by twelve " +
                        "outlying districts. ",20,false);

        book1.getDisplayText();

        Book book2 = new Book("Harry Potter and the Order of the Phoenix",
                "J.K. Rowling, Mary GrandPré (Illustrator)",
                "There is a door at the end of a silent corridor. And it’s haunting " +
                        "Harry Pottter’s dreams. ", 25, true);

        BookDataBase dataBase = new BookDataBase();



        dataBase.addBook("Java1001", new Book("Head First Java",	"Kathy Sierra and Bert Bates",
                "Easy to read Java workbook",	47.50, true));

        dataBase.addBook("Java1002", new Book("Thinking in Java",	"Bruce Eckel",
                "Details about Java under the hood",	20.00, true));

        dataBase.addBook("Orcl1003", new Book("OCP: Oracle Certified Professional Java SE",	"Jeanne Boyarsky",
                "Everything you need to know in one place",	45.00, true));

        dataBase.addBook("Python1004", new Book("Automate the Boring Stuff with Python",	"Al Sweigart",
                "Fun with Python",	10.50, true));

        dataBase.addBook("Zombie1005", new Book("The Maker's Guide to the Zombie Apocalypse",	"Simon Monk",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, true));

        dataBase.addBook("Rasp1006", new Book("Raspberry Pi Projects for the Evil Genius",	"Donald Norris",
                "A dozen fiendishly fun projects for the Raspberry Pi!",	14.75, true));





       /* System.out.println(book1.getDisplayText());
        System.out.println();
        System.out.println(book2.getDisplayText());
        System.out.println("\n");
        book2.getPriceForNBook(2);*/

        // Calling the getBook from our DataBases class
        Book bookOfRasp1006 = dataBase.getBook("Rasp1006");

        if (bookOfRasp1006 != null) System.out.println(bookOfRasp1006.getDisplayText());





    }
}
