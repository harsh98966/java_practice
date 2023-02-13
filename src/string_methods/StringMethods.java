/*
    - Always use String.equal method to compare strings
* */
package string_methods;

public class StringMethods {
    public static void main(String[] args) {
        String testString = "Hello, There.";
        System.out.println(testString.charAt(3));

        String s = "First";
        String s2 = "Second";
        String mcon = "FirstSecond";
        String con = s + s2;
        
        if(con == mcon){
            System.out.println("Equal String (== Operator)");
        } else {
            System.out.println("Not Equal (== Operator)");
        }

        if (con.equals(mcon)) {
            System.out.println("Equal (.equal Method)");
        } else{
            System.out.println("Not Equal (.equal Method)");
        }
    }
    
}
