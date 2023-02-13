package file_handling;

import java.io.*;

class Intern implements Serializable {
    private String name;
    private int idNum;
    public Intern(String name, int idNum){
        this.name = name;
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return " [" + name + ", " + (idNum) + "]";
    }
}
public class ObjectIO {
    public static void main(String[] args) {
        Intern intern = new Intern("Harsh", 12);
        System.out.println(intern);

        try{
            // file to write output
            File file = new File("src/file_handling/outfile.txt");
            // checking if file already exists or not
            if(!file.exists()){
                file.createNewFile();
            }

            // overriding the contents of the file.
            // first we need output stream
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(file));
            obj.writeObject(intern);

            // getting the contents of the file
            // creating input stream object
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(file));

            // getting the object from the file
            Intern intern1 = (Intern)objIn.readObject();

            // printing it on screen
            System.out.println("Object from the file: ");
            System.out.println(intern1);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
