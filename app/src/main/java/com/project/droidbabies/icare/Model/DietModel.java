package com.project.droidbabies.icare.Model;

/**
 * Created by sajidMacPro on 4/21/16.
 */
public class DietModel {
    private int dietId;
    private String  dietName,dietType,menu,dietDate,dietTime;
    private int status,userId;

    public DietModel(int dietId, String dietName, String dietType,
                     String menu, String dietDate, String dietTime, int status, int userId) {
        this.dietId = dietId;
        this.dietName = dietName;
        this.dietType = dietType;
        this.menu = menu;
        this.dietDate = dietDate;
        this.dietTime = dietTime;
        this.status = status;
        this.userId = userId;
    }

    public int getDietId() {
        return dietId;
    }

    public String getDietName() {
        return dietName;
    }

    public void setDietName(String dietName) {
        this.dietName = dietName;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getDietDate() {
        return dietDate;
    }

    public void setDietDate(String dietDate) {
        this.dietDate = dietDate;
    }

    public String getDietTime() {
        return dietTime;
    }

    public void setDietTime(String dietTime) {
        this.dietTime = dietTime;
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
