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
public class BatchesPojo {

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public BatchesPojo(String BatchId, String StartTime, String EndTime) {
        this.BatchId = BatchId;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
    }

    public BatchesPojo() {
    }
    private String BatchId;
    private String StartTime;
    private String EndTime;
}
