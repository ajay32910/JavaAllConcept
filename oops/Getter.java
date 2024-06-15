//package oops;
class Person{
    private String name,loc;
    private int age;
    //setter methond
    void setName(String s){
        this.name=s;
    }
    void setLocation(String loc){
        this.loc=loc;
    }
    void setAge(int age){
        this.age=age;
    }
    //getter method for above variable
    String getName(){
        return name; 
    }
    String getLocation(){
        return loc;
    }
    int getAge(){
        return age;
    }
}
public class Getter {
    public static void main(String args[]){
        Person p=new Person();
        p.setAge(19);
        p.setLocation("earth");
        p.setName("rohan");
        //now print all value
        System.out.println(p.getName()+" "+p.getLocation()+" "+p.getAge());
    }
    
}
