
public class LibraryDemo {

    public static void main(String[] args) {
        Library L = new Library();
        L.fibdByGenre(Genre.HYSTORY);
        System.out.println();
        L.fibdByAuthor("Frank Baum");
        System.out.println();
        L.fibdByTitle("How Linux Works");
        System.out.println();
    }
}
