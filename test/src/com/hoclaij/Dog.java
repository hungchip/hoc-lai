package com.hoclaij;

public class Dog extends Animal implements IAnimalAction{
    private String food;
    private Animal animal;

    public Dog( String food, Animal animal) {

        this.food = food;
        this.animal = animal;
    }

    public Dog(){
        super();
        this.food = "";
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void inputInformation() {
        System.out.println("day la con cho");
    }

    @Override
    public void move() {
        System.out.println("cho chay");
    }

    @Override
    public void eat() {
        System.out.println("cho an " + this.food);
    }


}
