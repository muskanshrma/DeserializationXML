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
    private CustomerAddressPojo address;

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

    public String getCustomerAddress() {
        return address.getAddress() +
                " City:" + address.getCity() +
                " Zip Code:" + address.getZip() +
                " Country:" + address.getCountry();
    }
}