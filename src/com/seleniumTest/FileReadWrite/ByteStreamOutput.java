package com.seleniumTest.FileReadWrite;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamOutput
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader in = null;
        FileWriter out = null;
        try
        {
            in = new FileReader("C:/Users/Jared/IdeaProjects/TestProject/ExampleFile.txt");
            out = new FileWriter("C:/Users/Jared/IdeaProjects/TestProject/ExampleFileOut.txt");
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
