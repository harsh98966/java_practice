package file_handling;

import java.io.*;
import java.util.Scanner;

public class FileIOTest {
    public static void main(String[] args) {
        // File inputstream
        try {
            File file = new File("src/file_handling/testfile.txt");

            FileInputStream fs = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            PrintStream cout = System.out;
            cout.println("This line is printed using PrintStream Object");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
