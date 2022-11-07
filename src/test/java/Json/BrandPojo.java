package Json;

public class BrandPojo {

    private String id;
    private String name;
    private Brand2Pojo brand;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandDetail() {
        return "Brand details : "+ brand.getBrandId() + " " + brand.getBrandName();
    }
}