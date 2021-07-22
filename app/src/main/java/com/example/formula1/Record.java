package com.example.formula1;

import java.util.Collection;

public class Record {
    //attributes
    private RecordType type;
    private String name;

    //getters and setters

    public RecordType getType() {
        return type;
    }

    public void setType(RecordType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //constructor
    public Record() {
        this.type = new RecordType();
        this.name = "";
    }

    public Record(RecordType type, String name) {
        this.type = type;
        this.name = name;
    }

}
