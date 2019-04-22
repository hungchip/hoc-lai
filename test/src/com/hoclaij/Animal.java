package com.hoclaij;

public abstract class Animal {
    private String name;
    private String kind;


    public Animal(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public Animal() {
        this.name = "";
        this.kind = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public abstract void inputInformation();



}
