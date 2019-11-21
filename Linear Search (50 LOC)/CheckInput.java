
import java.util.Scanner;
/**
 *
 * @author 141638
 */
public class CheckInput {
    Scanner sc = new Scanner(System.in);
    
    int CheckInput(){
        int c = 0;
        String Numtext;
        do{
            Numtext = sc.nextLine();
           try{
               if(Numtext.matches("[0-9]+")){
                   c = Integer.parseInt(Numtext);
                   break;
               }
           } 
           catch(ArithmeticException e){}System.err.println("Invalid Input!!");
        }
        while(true);
        return c;
    }
 
}
