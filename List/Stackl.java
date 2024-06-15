import java.util.*;
public class Stackl {
    public static void main(String[] args) {
        //stack extends vector class
        //thread safe hota hai
        Stack<Integer> st=new Stack<Integer>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.add(10);
        //remove,clear, contains()
        
        Stack<Integer>st1=new Stack<>();
        st1.addAll(st);
        st1.push(10);
        System.out.println(st1);
        int val=st.search(1);
        System.out.println(val);
        //pop remove and return element
        //top() ke place mein peek use krte hai
        System.out.println(st.peek());//we peeek or pop() element form empty stack it will give empty stack exception
       // for(Integer x:st)System.out.println(x);
        while(!st.empty()){
            System.out.println(st.pop());
        }
    }
}
