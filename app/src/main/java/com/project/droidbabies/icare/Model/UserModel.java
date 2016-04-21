package com.project.droidbabies.icare.Model;

/**
 * Created by Sumon on 4/21/2016.
 */
public class UserModel {
    private int user_id;
    private String fullName;
    private String age;
    private String bloodGroup;
    private String majorDisease;
    private String height;
    private String weight;

    public UserModel(int user_id, String fullName, String age, String bloodGroup,
                     String majorDisease, String height, String weight) {
        this.user_id = user_id;
        this.fullName = fullName;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.majorDisease = majorDisease;
        this.height = height;
        this.weight = weight;
    }

    public UserModel(String fullName, String age, String bloodGroup, String majorDisease, String height, String weight) {
        this.fullName = fullName;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.majorDisease = majorDisease;
        this.height = height;
        this.weight = weight;
    }

    public UserModel() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMajorDisease() {
        return majorDisease;
    }

    public void setMajorDisease(String majorDisease) {
        this.majorDisease = majorDisease;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

