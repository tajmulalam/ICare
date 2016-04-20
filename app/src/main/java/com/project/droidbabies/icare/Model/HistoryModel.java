package com.project.droidbabies.icare.Model;

/**
 * Created by sajidMacPro on 4/21/16.
 */
public class HistoryModel {
    private int historyId;
    private String photo,doctorName,details,date,userId;

    public HistoryModel(int historyId, String photo, String doctorName,
                        String details, String date, String userId) {
        this.historyId = historyId;
        this.photo = photo;
        this.doctorName = doctorName;
        this.details = details;
        this.date = date;
        this.userId = userId;
    }

    public int getHistoryId() {
        return historyId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
