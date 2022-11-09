package XML;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BookDetailsPojo {

    @JacksonXmlProperty(localName = "author")
    private String Author;

    @JacksonXmlProperty(localName = "title")
    private String Title;

    @JacksonXmlProperty(localName = "genre")
    private String Genre;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

}