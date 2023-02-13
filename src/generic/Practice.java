package generic;

class A {
    public int a = 10;
    static{
        System.out.println("IN A: ");
    }
    A(){
        System.out.println("In A value="+a);
    }

    public int getA() {
        return a;
    }
}

class B extends A{
    static{
        System.out.println("IN B: ");
    }

    B(){
    }

    @Override
    public int getA() {
        return a;
    }
}
public class Practice {
    public static void main(String[] args) {
        A test = new B();
        System.out.println(test.getA() + " , " + test.a);
    }
}
