package com.seleniumTest.FileReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharStreamInput
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream in = null;
        try
        {
            in = new FileInputStream("C:/Users/Jared/IdeaProjects/TestProject/ExampleFile.txt");
            int i = 0;
            while((i = in.read()) != -1)
            {
                System.out.print((char) i);
            }
        }finally
        {
            in.close();
        }
    }
}
