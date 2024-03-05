package java_02.Quiz05;

import java_02.Quiz04.Parent;

public class ChildExample {
    public static void main(String[] args) {

        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

     
     parent.field2 = "data2"; //(불가능)
     parent.method3(); //(불가능)
        
        /*
        부모 객체에 메소드 생성
         */
    
    }
}
