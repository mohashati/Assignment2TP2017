/**
 * Created by tmoshasha on 2017/03/29.
 */
public class ThrowExceptionClass {
    //public String MyException(String message){
        //return null;
   // }

    public int method1(int i) throws IllegalArgumentException{
        if (i<0)
            throw new IllegalArgumentException("value cannot be negative");
        System.out.println("The positive value is " + i );
        return 0;
    }
}
