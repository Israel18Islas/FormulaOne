package com.example.formula1;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class Profile {
    private int id;
    private String name;
    private String team;
    private Drawable photo;
    private ArrayList<Record> typeRecord;

    //getters and setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Drawable getPhoto() {
        return this.photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public ArrayList<Record> getTypeRecord() {
        return this.typeRecord;
    }

    public void setTypeRecord(ArrayList<Record> typeRecord) {
        this.typeRecord = typeRecord;
    }

    //constructors
    public Profile() {
        this.id = 0;
        this.name = "";
        this.team = "";
        this.photo = null;
        this.typeRecord = new ArrayList<Record>();
    }

    public Profile(int id, String name, String team, Drawable photo) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.photo = photo;
        this.typeRecord = new ArrayList<Record>();
    }

    public Profile(int id, String name, String team, Drawable photo, ArrayList<Record> typeRecord) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.photo = photo;
        this.typeRecord = typeRecord;
    }
    //instance methods
    public void addRecord(Record logro){
        this.typeRecord.add(logro);
    }
}
