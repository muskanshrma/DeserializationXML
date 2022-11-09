package XML;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BooksMain {
    @Test
    public static void BooksTest() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String readContent = new String(Files.readAllBytes(Paths.get("BookCatalog.xml")));
        BookPojo BookData = xmlMapper.readValue(readContent, BookPojo.class);
        System.out.println("Book 1: ");
        System.out.println("Book Author: " + BookData.getBooks().get(0).getAuthor());
        System.out.println("Book genre: " +BookData.getBooks().get(0).getGenre());
        System.out.println("Book Title: " +BookData.getBooks().get(0).getTitle());
        System.out.println("Book 2: ");
        System.out.println(BookData.getBooks().get(1).getAuthor());
        System.out.println(BookData.getBooks().get(1).getGenre());
        System.out.println(BookData.getBooks().get(1).getTitle());
    }
    public static void main(String[] args) throws IOException {
        BooksTest();
    }
}