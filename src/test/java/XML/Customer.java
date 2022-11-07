package XML;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Customer {
    public static void deserializeFromXML() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String readContent = new String(Files.readAllBytes(Paths.get("data.xml")));
        CustomerPojo deserializedData = xmlMapper.readValue(readContent, CustomerPojo.class);
        System.out.println("Deserialized data: ");
        System.out.println("\tCompany: " + deserializedData.getCompanyName());
        System.out.println("\tContact: " + deserializedData.getContactName());
        System.out.println("\tPhone: " + deserializedData.getPhone());
        CustomerAddress deserializedDataAddress = xmlMapper.readValue(readContent, CustomerAddress.class);
        System.out.println("\tAddress: " + deserializedDataAddress.getAddress());
        System.out.println("\tAddress: " + deserializedDataAddress.getCity());
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Deserializing from XML...");
        deserializeFromXML();
    }
}