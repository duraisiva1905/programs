package lab9;
import java.util.*;
public class exceptions {
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int a=10/10;
            Scanner obj=new Scanner(System.in);
            int b=Integer.parseInt(obj.next());
            int x[]=new int[10];
            x[0]=9;
            String y="pavithra";
            char xx=y.charAt(9);
            System.out.println(xx);
           
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
        catch(NumberFormatException aa){
            System.out.println(aa);
        }
        catch(ArrayIndexOutOfBoundsException aaa){
            System.out.println(aaa);
        }
        catch(StringIndexOutOfBoundsException aaaa){
            System.out.println(aaaa);
        }
           
   
       
    }
   
}

    
    

