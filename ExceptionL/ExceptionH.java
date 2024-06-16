//types of error
//check ,unchecked , error
public class ExceptionH {
    public static void main(String[] args) {
        try{
            int ans=10/0;
        }

        // catch(ArithmeticException ae){
        //     System.out.println("this is arithmetic exception");
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        finally{
            System.out.println("final block");
        }
        //throw is used to throw error it is inside method
        //throws is used to in method signature to indicate this method may throw some exception
    }
}
