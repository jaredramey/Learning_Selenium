package com.seleniumTest.FileReadWrite;

import java.io.*;

public class FileIO_Assignment
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //Create reader, writer, and name being looked for
        BufferedReader in = null;
        BufferedWriter out = null;
        String nameToLookFor = "Adams";

        try
        {
            //Initialize the reader and writer using BufferedReader/ BufferedWriter to read entire lines at once.
            in = new BufferedReader(new FileReader("C:/Users/Jared/IdeaProjects/TestProject/src/com/seleniumTest/FileReadWrite/Names.txt"));
            out = new BufferedWriter(new FileWriter("C:/Users/Jared/IdeaProjects/TestProject/src/com/seleniumTest/FileReadWrite/Adams.txt"));
            //Read the first line of the file
            String line = in.readLine();
            while(line != null)
            {
                //Check to see if the current line has the name
                if(line.contains(nameToLookFor))
                {
                    //If the line has the name, print it and save to new file.
                    System.out.println(line);
                    out.write(String.format("%s \n", line)); //Add \n so each name ends up on its own line
                }
                //Read the next line in the file
                line = in.readLine();
            }
        }finally
        {
            //Close the files
            in.close();
            out.close();
        }
    }
}
