package com.example.apple.travelinindia.datamodel;

public class DataModelTravel {
    String name;

    int id_;
    int image;

    public DataModelTravel( String name, int id_, int image) {
        this.name = name;

        this.id_ = id_;
        this.image=image;
    }

    public String getName() {
        return name;
    }



    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}
