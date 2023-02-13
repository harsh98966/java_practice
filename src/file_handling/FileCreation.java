package file_handling;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileCreation {
    public static void main(String[] args) {
        // relative path (relative to java project directory)
        File file = new File("src/file_handling/testfile.txt");
        try {
            file.createNewFile();
            System.out.println(file.getAbsoluteFile());

            // we can also use absolute path in java
            File absFile = new File("C:\\Users\\HarshKumar\\IdeaProjects\\Java_practice\\src\\file_handling\\absFile.txt");
            absFile.createNewFile();

            // directory can also be created using File class in java
            File dir = new File("src/file_handling/CreatedUsingProgram");
            dir.mkdir(); // returns boolean

            // subdirectories can also be created in java
            File dirs = new File("src/file_handling/java/fileHndle");
            dirs.mkdirs();

            // writing onto files
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
                // Overwriting
                bw.write("First line\n");
                bw.write("Second line");

                // appending
                bw.append("Append flag is used to append contents in a file.");

                bw.close();

                BufferedReader br = new BufferedReader(new FileReader(file));

//                br.lines().forEach(line ->{
//                    System.out.println(line);
//                });

//              another way to read file
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }

                Scanner sc = new Scanner(file);
                System.out.println(sc.nextLine());

                FileInputStream finput = new FileInputStream(file);
                System.out.println(finput.available());
            } catch (Exception e){

                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}