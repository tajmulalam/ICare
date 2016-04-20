package com.project.droidbabies.icare.Model;

/**
 * Created by sajidMacPro on 4/21/16.
 */
public class DoctorModel {
    private int doctorId;
    private String doctorName,doctorDetails,appointment,phone,email;
    private int userId;


    public DoctorModel(int doctorId, String doctorName, String doctorDetails,
                       String appointment, String phone, String email, int userId) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorDetails = doctorDetails;
        this.appointment = appointment;
        this.phone = phone;
        this.email = email;
        this.userId = userId;
    }

    public int getDoctorId() {
        return doctorId;
    }


    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorDetails() {
        return doctorDetails;
    }

    public void setDoctorDetails(String doctorDetails) {
        this.doctorDetails = doctorDetails;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
