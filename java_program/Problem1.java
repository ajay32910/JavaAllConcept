//package java_program;
import java.util.*;
class palindrome{
    boolean check_palindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--))return false;
        }
        return true;
    }
}

public class Problem1 {
    //check if string is palindrome or not
    public static void main(String args[]){
        palindrome p=new palindrome();
        Scanner sc=new Scanner(System.in);
        //String str=sc.next();
        String str="aba";
        boolean val=p.check_palindrome(str);
        System.out.println(val);
        

    }
}
