//package oops;


class Emp{
    int id;
    String name;
    String pos;
    //below is constructor 
    //
    Emp(int id,String name,String pos){
        this.id=id;
        this.name=name;
        //return;//we cant return any value but we can use return to eary return from constructor
        this.pos=pos;
    }
    void fun(){
        System.out.println(id+" "+name+" "+pos);
    }
}
public class ClassEg{
    int x;
     private ClassEg(){
        //private constructor use in singleton design pattern
        //class that need strict contol over object creation
        System.out.println("i am private constructor");
    }
    public static void main(String[] args) {
        //Emp e=new Emp(1,"rohan","intern");
        //e.fun();
        //System.out.println("it's running");
        ClassEg c=new ClassEg();

    }
}