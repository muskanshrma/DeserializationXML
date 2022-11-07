package XML;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class CustomerPojo {
    @JsonProperty("CompanyName")
    private String companyName;
    @JsonProperty("ContactName")
    private String contactName;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("FullAddress")
    private List<String> address = new ArrayList<>();

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public List<String> getAddress() {
        return address;
    }
    public void setAddress(List<String> address) {
        this.address = address;
    }
}