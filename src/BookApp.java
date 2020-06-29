public class BookApp {
    public static void main(String[] args){
        Book book1 = new Book();

        book1.setTitle("The Hunger Games");
        book1.setAuthor("Suzanne Collins");
        book1.setDescription("In the ruins of a place once known as North America lies the nation of Panem, " +
                "a shining Capitol surrounded by twelve outlying districts. The Capitol is harsh and cruel " +
                "and keeps the districts in line by forcing them all to send one boy and once girl between " +
                "the ages of twelve and eighteen to participate in the annual Hunger Games, a fight to the death " +
                "on live TV.");

        book1.getDisplayText();

        Book book2 = new Book("Harry Potter and the Order of the Phoenix",
                "J.K. Rowling, Mary GrandPré (Illustrator)",
                "There is a door at the end of a silent corridor. And it’s haunting " +
                        "Harry Pottter’s dreams. Why else would he be waking in the middle of the " +
                        "night, screaming in terror?\n Harry has a lot on his mind for this, his fifth " +
                        "year at Hogwarts: a Defense Against the Dark Arts teacher with a personality like " +
                        "poisoned honey; a big surprise on the Gryffindor Quidditch team; and the looming " +
                        "terror of the Ordinary Wizarding Level exams. But all these things pale next to " +
                        "the growing threat of He-Who-Must-Not-Be-Named - a threat that neither the magical" +
                        " government nor the authorities at Hogwarts can stop.\n As the grasp of " +
                        "darkness tightens, Harry must discover the true depth and strength of his " +
                        "friends, the importance of boundless loyalty, and the shocking price of" +
                        " unbearable sacrifice.", 25, true);

        //System.out.println(book1.getDisplayText());
       // System.out.println();
        //System.out.println(book2.getDisplayText());
        //System.out.println("\n");

        book2.getPriceForNBook(2);




    }
}
