package com.horseman.crew;

public class PersonModel {
    private String image, name, agency, status;

    public PersonModel() {
    }

    public PersonModel(String image, String name, String agency, String status) {
        this.image = image;
        this.name = name;
        this.agency = agency;
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
