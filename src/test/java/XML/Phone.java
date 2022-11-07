package XML;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Phone {
    public static void deserializeFromXML() throws IOException {
            XmlMapper xmlMapper = new XmlMapper();
            String readContent = new String(Files.readAllBytes(Paths.get("demo.xml")));
            PhonePojo deserializedData = xmlMapper.readValue(readContent, PhonePojo.class);
            System.out.println("Deserialized data: ");
            System.out.println("\tName: " + deserializedData.getName());
            System.out.println("\tMemory: " + deserializedData.getMemory());
            System.out.println("\tDisplay Size: " + deserializedData.getDisplaySize());
        }

    public static void main(String[] args) throws IOException {
        System.out.println("Deserializing from XML...");
        deserializeFromXML();
    }
}