package com.seleniumTest.FileReadWrite;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreamInput
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader in = null;
        try
        {
            in = new FileReader("C:/Users/Jared/IdeaProjects/TestProject/ExampleFile.txt");
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
