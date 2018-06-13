package com.seleniumTest.Interfaces;

public class Ford implements Vehicle
{
    @Override
    public void Start()
    {
        System.out.println("Starting");
    }

    @Override
    public void Stop()
    {
        System.out.println("Stopping");
    }

    @Override
    public void Cruise()
    {
        System.out.println("Cruising");
    }

    public static void main(String[] args)
    {
        Ford F150 = new Ford();
        F150.Start();
        F150.Cruise();
        F150.Stop();
    }
}
