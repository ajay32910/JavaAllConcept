//package string;
//things in string
//imutability, thread safety, performance, usgaes
public class stringl {
    public static void main(String[] args) {
         char ch[]={'m','o','h','a','n'};
        // ch[0]='a';
        String chs=new String(ch);
        //.substring()
        //isBlan() also check for white space
        //isEmpty()check whether lenght is zero or not
        
        // char stch[]=chs.toCharArray();
        // System.out.println(stch);
        // System.out.println(ch);
        // String s1="hello";
        // String s2="hello";
        // System.out.println(s1.toUpperCase());;
        // System.out.println(s1.substring(1,3));
        // //s1 and s2 both are pointing to same location
        // String s3=new String();
        // s3+="hello";
        // System.out.println(s1==s2);//both are same reference so, answer will be true
        // System.out.println(s1==s3);//both are different refercnece so, answer will be false
        // System.out.println(s1.equals(s3));//here content is compared for both strings
        // //replace , delete, add, at
        // System.out.println(s1.charAt(0));
        // System.out.println(s1.length());
        // System.out.println(s1.replace('h', 'n'));
        // System.out.println(s1);
        //valueOf()//return string input can be int, float, double
        // //string buffer
        // //mutable, performance slower than string builder
        // //
        // System.out.println("now learn string buffer concept");
        // StringBuffer sb1=new StringBuffer("buffer");
        // //sb1=sb1+"new";aise append nhi hota yaha;
        // sb1.append("new");
        //append is not avilabele for String object
        // System.out.println(sb1);
        // //charAt(),deleteCharAt()
        //stringbuilder thread safe nhi hota hai
        StringBuffer sb1=new StringBuffer("hello");
        //there no option to convert stringbuiffer to to charArray
        
        System.out.println(sb1);
        sb1.append('c');
        System.out.println(sb1);
        System.out.println(sb1.charAt(0));
        //setCharAt(i,'c')//use to set character in string buffer and string bulider
        //how to reverse string buffer
        StringBuilder sbd=new StringBuilder("stringBuilder");
        
        


        //replace
        //delete




    }
}
