package com.hoclaij;


public class Cat extends Animal implements IAnimalAction{
    private String hairColor;
    private String food;

    public Cat(String hairColor, String source) {
        this.hairColor = hairColor;
        this.food = source;
    }

    public Cat(){
        this.hairColor = "";
        this.food = "";
    }

    @Override
    public void inputInformation() {
        System.out.println("nhập thông tin :");
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void move() {
        System.out.println("meo nhay cao");
    }

    @Override
    public void eat() {
        System.out.println("meo an " + this.food );
    }
}
