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
public class PaymentPojo {

    public String getPaymentID() {
        return PaymentID;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public String getEnrollmentId() {
        return EnrollmentId;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setPaymentID(String PaymentID) {
        this.PaymentID = PaymentID;
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public void setEnrollmentId(String EnrollmentId) {
        this.EnrollmentId = EnrollmentId;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public PaymentPojo() {
    }

    public PaymentPojo(String PaymentID, String PaymentDate, String EnrollmentId, Double Amount) {
        this.PaymentID = PaymentID;
        this.PaymentDate = PaymentDate;
        this.EnrollmentId = EnrollmentId;
        this.Amount = Amount;
    }
    
    private String PaymentID;
    private String PaymentDate;
    private String EnrollmentId;
    private Double Amount;
}
