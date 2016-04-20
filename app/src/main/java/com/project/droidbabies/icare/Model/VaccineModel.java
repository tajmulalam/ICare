package com.project.droidbabies.icare.Model;

/**
 * Created by sajidMacPro on 4/21/16.
 */
public class VaccineModel {
    private int vaccineId;
    private String vaccinename,vaccineDate,vaccineDetails;
    private int status,userId;

    public VaccineModel(int vaccineId, String vaccinename, String vaccineDate,
                        String vaccineDetails, int status, int userId) {
        this.vaccineId = vaccineId;
        this.vaccinename = vaccinename;
        this.vaccineDate = vaccineDate;
        this.vaccineDetails = vaccineDetails;
        this.status = status;
        this.userId = userId;
    }

    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccinename(String vaccinename) {
        this.vaccinename = vaccinename;
    }

    public String getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(String vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public String getVaccineDetails() {
        return vaccineDetails;
    }

    public void setVaccineDetails(String vaccineDetails) {
        this.vaccineDetails = vaccineDetails;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
