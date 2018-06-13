package com.seleniumTest.FileReadWrite;

import java.io.*;

public class CharStreamOutput
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;
        try
        {
            in = new FileInputStream("C:/Users/Jared/IdeaProjects/TestProject/ExampleFile.txt");
            out = new FileOutputStream("C:/Users/Jared/IdeaProjects/TestProject/ExampleFileOut.txt");
            int i = 0;
            while((i = in.read()) != -1)
            {
                out.write((char)i);
            }
        }finally
        {
            in.close();
            out.close();
        }
    }
}
