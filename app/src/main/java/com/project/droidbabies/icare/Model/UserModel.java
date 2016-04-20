package com.project.droidbabies.icare.Model;

/**
 * Created by sajidMacPro on 4/21/16.
 */
public class UserModel {
    private int userId;
    private String age,bloodGroup,majorDisease,hieght,weight;

    public UserModel(int userId, String age, String bloodGroup,
                     String majorDisease, String hieght, String weight) {
        this.userId = userId;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.majorDisease = majorDisease;
        this.hieght = hieght;
        this.weight = weight;
    }

    public int getUserId() {
        return userId;
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

    public String getHieght() {
        return hieght;
    }

    public void setHieght(String hieght) {
        this.hieght = hieght;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
