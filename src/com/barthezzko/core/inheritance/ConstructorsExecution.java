package com.barthezzko.core.inheritance;

import org.junit.Test;

public class ConstructorsExecution {

    @Test
    public void testConstructors(){
        Animal cat = new Cat();
        cat.say();
    }

}

class Animal {

    static {
        System.out.println("static init an animal");
    }
    {
        System.out.println("init an animal");
    }
    public Animal() {
       System.out.println("new animal");
    }

    public void say(){
        System.out.println("Animal says: hey");
    }
}

class Cat extends Animal {

    static {
        System.out.println("static init a cat");
    }
    {
        System.out.println("init a cat");
    }

    public Cat(){
        System.out.println("new Cat");
    }

    public void say(){
        System.out.println("Cat says: meow");
    }
}
