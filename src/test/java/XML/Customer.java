package XML;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Customer {
    @Test
    public static void customerTest() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String readContent = new String(Files.readAllBytes(Paths.get("data.xml")));
        CustomerPojo deserializedData = xmlMapper.readValue(readContent, CustomerPojo.class);
        System.out.println("Deserialized Customer data: ");
        System.out.println("Company: " + deserializedData.getCompanyName());
        System.out.println("Contact: " + deserializedData.getContactName());
        System.out.println("Phone: " + deserializedData.getPhone());
        System.out.println("Address: " + deserializedData.getCustomerAddress());
    }
    public static void main(String[] args) throws IOException {
        customerTest();
    }
}