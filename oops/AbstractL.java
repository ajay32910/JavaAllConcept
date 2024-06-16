//package oops;
abstract class BikeA{
    //abstrast call cant' insiated 
    //class which is extending abastract class have to implement all of his abstrast method
    // abstract can have static and final method also;
    //abstract class can have constructor
    //abstract method can't be private
    //static metod can be private

    BikeA(){
        System.out.println("abstract class constructor");
    }
     abstract void fun1();
     void fun2(){
        System.out.println("this is a fun2");
    }
    static void fun3(){
        System.out.println("this is static metdod");
    }
    final void fun4(){
        System.out.println("this is a final method");
    }
    static final void 
     fun5(){
        System.out.println("static fina metod");
    }


}
class BikeB extends BikeA{
    void fun1(){
        System.out.println("here is implementation of fun1");
    }
    void fun2(){
        System.out.println("overrided here");
    }
}

public class AbstractL {
    public static void main(String[] args) {
        BikeA.fun3();
        BikeB.fun3();//static method can be called without creating class of object
        BikeA obj1=new BikeB();
        obj1.fun1();
    }
}
