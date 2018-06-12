package com.seleniumTest.selenium;

import java.awt.*;

public class RegularExpressionsTest
{
    public static final String EXAMPLE_TEST = "This is my " + "small example.";

    public static void main(String[] args)
    {
        System.out.println(EXAMPLE_TEST.matches("\\w.*")); //return true if string matches
        String[] splitString = (EXAMPLE_TEST.split("\\s+")); //split each string by white space
        System.out.println(splitString.length);
        //Loop to print each word
        for(String string : splitString)
        {
            System.out.println(string); //Print each string in splitString
        }
        //Replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
    }
}
