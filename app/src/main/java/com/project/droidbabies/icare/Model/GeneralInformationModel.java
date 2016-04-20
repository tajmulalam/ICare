package com.project.droidbabies.icare.Model;

/**
 * Created by Mobile App Develop on 20-4-16.
 */
public class GeneralInformationModel {
    private  int Infoid;
    private String  title , description,collectedFrom;

    public GeneralInformationModel(int infoid, String title, String description, String collectedFrom) {
        Infoid = infoid;
        this.title = title;
        this.description = description;
        this.collectedFrom = collectedFrom;
    }

    public GeneralInformationModel() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCollectedFrom() {
        return collectedFrom;
    }
}
