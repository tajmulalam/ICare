package com.project.droidbabies.icare.Model;

/**
 * Created by sajidMacPro on 4/21/16.
 */
public class HospitalModel {
    private int hospitalId;
    private String hospitalName,hospitalAddress,longitude,latitude,phone,website;

    public HospitalModel(int hospitalId, String hospitalName, String hospitalAddress,
                         String longitude, String latitude, String phone, String website) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
        this.website = website;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
