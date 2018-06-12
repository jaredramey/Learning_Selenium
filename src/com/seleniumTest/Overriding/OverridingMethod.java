package com.seleniumTest.com.seleniumTest.Overriding;

public class OverridingMethod
{
    public static void main(String[] args)
    {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Dog a3 = new Dog();

        a1.Talk();
        a2.Talk();
        a3.Talk();
    }
}
