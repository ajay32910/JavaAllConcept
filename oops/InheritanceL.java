//package oops;
//learn inheritance concept in java
//multiple inheritance is not allowed to avoid diamond problem 
class Animal{
    Animal(){
        System.out.println("animal constructor");
    }
     void move(){
        System.out.println("animal use to move");
    }
    void supper(){
        System.out.println("this is use to call from child class");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("dog constructor");
    }
    void language(){
        System.out.println("dog use to bark");
    }
    //method overriding 
    // also run time polymorphism determoine at run time
    void move(){
        System.out.println("dog also move");
    }
    void supper(){
        super.supper();//call parent function
        
    }
}
public class InheritanceL {
    public static void main(String[] args) {
        Animal a=new Dog();// only methods of animal can called
        //animal refernce can't store in dog\\
        a.move();//overdie method will be called
        //a.language();//we cant call this
        Dog a1=new Dog();
        //private metod can't be inheritated
        //type of inheritance singe level, multilevel,hierarchical
        a1.move();
        a1.language();
        a1.supper();
        
    }
}
