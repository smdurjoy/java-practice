package lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "prime-numbers.txt";
        try {
            File file = new File(fileName);
            file.createNewFile();
            writeToFile(fileName);
            readFromFile(file);

        } catch(IOException e) {
            System.out.println("Something Went Wrong!");
            e.printStackTrace();
        }
    }

    static void writeToFile(String fileName) {
        int i, counter, j;
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.flush();
            for(j=2; j<=100; j++) {
                counter=0;
                for(i=1; i<=j; i++) {
                   if (j%i==0) {
                      counter++;
                   }
                }
                if (counter == 2) {
                    writer.append(j+" ");
                }
            }
            writer.close();
        } catch(IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }

    static void readFromFile(File fileObj) {
        try {
            Scanner myReader = new Scanner(fileObj);
            System.out.println("\nPrime numbers from 1 to 100:");
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}