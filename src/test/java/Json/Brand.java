package Json;

import com.google.gson.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brand {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        File inputJsonFile = new File(System.getProperty("user.dir") + "//src//test//java//Json//BrandData.json");
        FileReader fileReader = new FileReader(inputJsonFile);
        BrandPojo record = gson.fromJson(fileReader, BrandPojo.class);
        System.out.println("ID :" + record.getId());
        System.out.println("LastName :" + record.getName());
        System.out.println("Brand Details :" + record.getBrandDetail());
    }
}