package com.company;

public class Dog {
    public int size;
    private String name;

    public void bark() {
        if (size > 60) {
            System.out.println("Woof! Big");
        } else {
            System.out.println("Woef! Small");
        }
    }

}
