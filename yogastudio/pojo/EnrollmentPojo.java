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
public class EnrollmentPojo {

    public String getEnrollmentId() {
        return EnrollmentId;
    }

    public void setEnrollmentId(String EnrollmentId) {
        this.EnrollmentId = EnrollmentId;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public String getMonthlyFee() {
        return MonthlyFee;
    }

    public void setMonthlyFee(String MonthlyFee) {
        this.MonthlyFee = MonthlyFee;
    }

    public EnrollmentPojo() {
    }

    public EnrollmentPojo(String EnrollmentId, String CustomerId, String BatchId, String MonthlyFee) {
        this.EnrollmentId = EnrollmentId;
        this.CustomerId = CustomerId;
        this.BatchId = BatchId;
        this.MonthlyFee = MonthlyFee;
    }
    private String EnrollmentId;
    private String CustomerId;
    private String BatchId;
    private String MonthlyFee;
}
