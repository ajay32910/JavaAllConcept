//package string;
//reverse string, by iteration by recursion
//convert to upper case
//remove white space 

public class StringP {
    public static void main(String[] args) {
        //integre to string convert krna easy hai ""+1234
        //second method toString(jo bhi number hai);
        //string se integer mein Integer.parseInt()
        //second method Integr.valueOf(string passs kar doh)
        String str="Hello";
        // char ch[]=str.toCharArray();
        // for(int i=0,j=ch.length-1;i<j;i++,j--){
        //     char t=ch[i];
        //     ch[i]=ch[j];
        //     ch[j]=t;
        // }
        // str=new String(ch);
        // System.out.println(str);
        String ans="";
        int j=str.length()-1;
        
        while(j>=0){
            if(str.charAt(j)>='a'&&str.charAt(j)<='z')
            {
                ans+=(char)(str.charAt(j)+32);
            }
            ans+=str.charAt(j);
            j--;
        }
        System.out.println(ans);

        
    }
    
}
