package sample;

import java.io.FileWriter;
import java.io.IOException;

public class writer {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("writer.txt");
            writer.write("This is a program to write into text file");
            writer.close();
            System.out.println("You have successfully wrote into the file");
        } catch (IOException e) {
            System.out.println("There is something wrong");
            e.printStackTrace();
            }
        }

}
