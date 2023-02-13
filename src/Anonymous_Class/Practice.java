package Anonymous_Class;

 class Test{
    public void testMethod(){
        System.out.println("This is test method.");
    }

}
public class Practice {
    Test t = new Test(){
        @Override
        public void testMethod() {
            System.out.println("Test Method of Anonymous Class");
        }

        public void newMethod(){
            System.out.println("This is new Method");
        }

    };

    public static void main(String[] args) {
        Practice p = new Practice();
        p.t.testMethod();
    }

}
