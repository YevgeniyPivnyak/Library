/**
 * Created by Жека on 26.03.2016.
 */
public class Book {
    private String title;
    private String author;
    private Genre ganre;

    public Book(){

    }
    public Book(Genre genre, String author, String title){
        this.ganre = ganre;
        this.author = author;
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGanre() {
        return ganre;
    }

    public void setGanre(Genre ganre) {
        this.ganre = ganre;
    }
}

