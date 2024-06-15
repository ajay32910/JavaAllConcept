//package oops;
// interface is Is-a relation type
//use to achive abstraction
//use to achive multiple inheritance
//it can be used achove lose coupling
//interface can also be extendes
//we can have static method in java

interface Printable{
// we can have private method in interface
//data member public static and final// by default added by compiler
//method public and abstract method// by default added by compiler    
public  abstract void print();
int x=10;

}
interface Circle{
    void circle();
}
class A implements Printable,Circle{
     public void print(){
        System.out.println("this method now implemented");
    }
    public void circle(){
        System.out.println("this is circle intefrace implementation");
    }
}
public class InterfaceL {
    public static void main(String[] args) {
        A a=new A();
        a.print();
        a.circle();
        System.out.println(Printable.x);
        System.out.println(a.x);
    }
}
