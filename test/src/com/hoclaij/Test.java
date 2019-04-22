package com.hoclaij;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        IAnimalAction b = new Dog();
        Animal b2 = new Dog();
        ((Cat) a).setFood("Cut");
        ((Cat) a).eat();
        ((Dog) b).setFood("xuong");
        b.eat();

        ((Dog) b2).setFood("thit");
        ((Dog) b2).eat();
        IAnimalAction a2 = new Cat();
        ((Cat) a2).inputInformation();
    }
}
