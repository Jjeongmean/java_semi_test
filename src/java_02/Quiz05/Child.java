package java_02.Quiz05;

import java_02.Quiz04.Parent;

public class Child extends Parent {
    public String field2;
    public void method3() {
        System.out.println("Child-method3()");
    }
    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }
}
