package com.example.formula1;

import android.graphics.drawable.Drawable;

public class RecordType {
    //attributes
    private int id;
    private Drawable icon;
    private String name;
    private String value;

    //getters and setters

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //constructors
    public RecordType() {
        this.id = 0;
        this.icon = null;
        this.name = "";
        this.value = "";
    }

    public RecordType(int id, Drawable icon, String name, String value) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.value = value;
    }
}
