/*
    - Making different string literal will point to same address in the memory.
*/
package literal_and_object;
public class Literal {
    public static void main(String[] args) {
        String s = "Harsh";
        String s2 = "Harsh";
        String s3 = new String("Harsh");
        System.out.println("S: " + s.hashCode());
        System.out.println("S2: " + s2.hashCode());
        System.out.println("S3: " + s3.hashCode());
    }
}
