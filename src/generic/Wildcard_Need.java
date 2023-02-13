package generic;

import java.util.List;

class Temp {
    public void tempMethod(){
        System.out.println("Test Method");
    }
}

class T1<T> extends Temp{
    public <T>void test(List<T> t){

    }
}


public class Wildcard_Need {
}
