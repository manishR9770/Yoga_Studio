/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yogastudio.pojo;

/**
 *
 * @author Manish Rahangdale
 */
public class CustomerPojo {

    public CustomerPojo(String CustomerId, String CustomerName, String CustomerAge, String CustomerMoNo, String CustomerAddress) {
        this.CustomerId = CustomerId;
        this.CustomerName = CustomerName;
        this.CustomerAge = CustomerAge;
        this.CustomerMoNo = CustomerMoNo;
        this.CustomerAddress = CustomerAddress;
    }
    private String CustomerId;
    private String CustomerName;
    private String CustomerAge;
    private String CustomerMoNo;
    private String CustomerAddress;
    public CustomerPojo() {
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerAge() {
        return CustomerAge;
    }

    public void setCustomerAge(String CustomerAge) {
        this.CustomerAge = CustomerAge;
    }

    public String getCustomerMoNo() {
        return CustomerMoNo;
    }

    public void setCustomerMoNo(String CustomerMoNo) {
        this.CustomerMoNo = CustomerMoNo;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }
    
    
}
