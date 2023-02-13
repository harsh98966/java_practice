package file_handling;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        File file = new File("src/file_handling/testfile.txt");
        try (Scanner sc = new Scanner(file)) {
            String line = sc.nextLine();
            System.out.println(line);

            line = sc.nextLine();
            System.out.print(line);
        } catch (Exception e){
            e.printStackTrace();
        }
//        // Input file
//        try (InputStream fis = new FileInputStream("src/file_handling/testfile.txt")) {
//            // checking if file contains anything or not
//            if (fis.available() >= 1) {
//                // output file
//                try(FileOutputStream fos = new FileOutputStream("src/file_handling/absFile.txt")){
//                    int i;
//                    while((i = fis.read()) != -1){
//                        fos.write(i);
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
