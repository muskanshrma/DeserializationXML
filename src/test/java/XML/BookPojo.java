package XML;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import java.util.List;

public class BookPojo {

    @JsonProperty("book")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<BookDetailsPojo> book;

    public List<BookDetailsPojo> getBooks() {
        return book;
    }

    public void setBooks(List<BookDetailsPojo> book) {
        this.book = book;
    }
}