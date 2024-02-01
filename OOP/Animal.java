// package com.example.playground.OOP_interface;

public abstract class Animal {
    private Boolean toGo;
    private Boolean fly;
    private Boolean swim;

    public Boolean toGo() {
        return false;
    }

    public Boolean fly() {
        return false;
    }

    public Boolean swim() {
        return false;
    }

    public Animal(Boolean toGo, Boolean fly, Boolean swim) {
        this.toGo = false;
        this.fly = false;
        this.swim = false;
    }
}