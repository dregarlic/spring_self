package com.xu.jdk8;

//只有一个抽象方法的接口可以加FuntionalInterface
//复写的不算
@FunctionalInterface
interface MyInterface {
    void test();

    String toString();
    default void test2() {
    }
}
public class Test2 {

    public void test (MyInterface myInterface) {
        myInterface.test();
    }

    public static void main(String[] args) {
        System.out.println("1");
        Test2 test2 = new Test2();
        test2.test(() -> {
            System.out.println("xxxxxxx");
        });

         MyInterface myInterface = () -> {
             System.out.println("yyyyyyy");
         };
         test2.test(myInterface);

        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }

}
