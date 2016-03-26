public class Library {
    private Book[] books = new Book[100];

    private int startPosition = 0;

    public Library() {
        books[0] = new Book(Genre.FANTASY, "William Goldman", "The Princess Bride");
        books[1] = new Book(Genre.COMPUTERS, "Brian Ward", "How Linux Works");
        books[2] = new Book(Genre.FOOD, "Roald Dahl", "Charlie and the Chocolate Factory");
        books[3] = new Book(Genre.HYSTORY, "E. H. Gombrich", "A Little History of the World");
        books[4] = new Book(Genre.FANTASY, "Philip Pullman", "Northern Lights");
        books[5] = new Book(Genre.COMPUTERS, "Paul Hyde", "Java Thread Programming");
        books[6] = new Book(Genre.FANTASY, "George R. R.", "A Game of Thrones");
        books[7] = new Book(Genre.COMPUTERS, "Brian Goetz", "Concurrency In Practice");
        books[8] = new Book(Genre.FOOD, "Laura Esquivel", "Like Water For Chocolate");
        books[9] = new Book(Genre.HYSTORY, "G. J. Meyer", "The Tudors");
        books[10] = new Book(Genre.FANTASY, "Ursula K", "A Wizard of Earthsea");
        books[11] = new Book(Genre.COMPUTERS, "Maurice Herlihy", "Art Of Multiprocessor Programming");
        books[12] = new Book(Genre.FANTASY, "Peter S.", "The Last Unicorn");
        books[13] = new Book(Genre.COMPUTERS, "Philip Wadler", "Java Generics and Collections");
        books[14] = new Book(Genre.FOOD, "Ben Katchor", "Cheap Novelties");
        books[15] = new Book(Genre.HYSTORY, "Howard Zinn", "A People's History of the United States");
        books[16] = new Book(Genre.FANTASY, "J. M. Barry", "Peter Pan and Wendy");
        books[17] = new Book(Genre.COMPUTERS, "Elliotte Rusty", " Java I/O");
        books[18] = new Book(Genre.FANTASY, "Frank Baum", "The Wonderful Wizard of Oz");
        books[19] = new Book(Genre.COMPUTERS, "Ira R. Forman", "Java Reflection In Action");
        books[20] = new Book(Genre.FOOD, "James Beard", "Beard on Bread");
        books[21] = new Book(Genre.HYSTORY, "Charles C. Mann", "1491: New Revelations of the Americas Before Columbus");
        books[22] = new Book(Genre.FANTASY, "Lewis Carroll", "Alice's Adventures in Wonderland");
        books[23] = new Book(Genre.COMPUTERS, "George Reese", "Database Programming with JDBC and Java");
    }

    public void fibdByGenre(Genre genre) {
        int count = 0;

        for (int i = startPosition; i < books.length; i++) {

            if (genre.equals(books[i].getGanre())) {
                System.out.println(i + "-" + books[i].getGanre() + ": " + books[i].getTitle()
                        + ", by:" + books[i].getAuthor());

                count++;

            }
            if (count == 5) {
                startPosition = i + 1;
                break;
            }
        }
    }

    public void fibdByAuthor(String author) {
        int count = 0;

        for (int i = startPosition; i < books.length; i++) {

            if (author.equals(books[i].getAuthor())) {
                System.out.println(i + "-" + books[i].getGanre() + ": " + books[i].getTitle()
                        + ", by:" + books[i].getAuthor());

                count++;

            }
            if (count == 5) {
                startPosition = i + 1;
                break;
            }
        }
    }
    public void fibdByTitle(String title) {
        int count = 0;

        for (int i = startPosition; i < books.length; i++) {

            if (title.equals(books[i].getTitle())) {
                System.out.println(i + "-" + books[i].getGanre() + ": " + books[i].getTitle()
                        + ", by:" + books[i].getAuthor());

                count++;

            }
            if (count == 5) {
                startPosition = i + 1;
                break;
            }
        }
    }
}
