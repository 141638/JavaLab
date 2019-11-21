/**
 *
 * @author 141638
 */
import java.util.LinkedList;
import java.util.Random;

public class main {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 0;
        int x = 0;
        
        CheckInput ci = new CheckInput();
        System.out.println("Enter Number Of Array: ");
        do{
            try {
                n = ci.CheckInput();
                if(n > 0) break;
            } catch (Exception e) {} System.err.println("Size Of Array >= 1");
        }
        while(true);
        
        System.out.println("Enter Search Number: ");
        x = ci.CheckInput();
        
        int []ar = new int[n];
        
        
        LinkedList ll = new LinkedList();
        System.out.println("-------------------------------");
        System.out.print("The Array: ");
        for(int i = 0;i<ar.length;i++){
            ar[i] = rand.nextInt(n);
            System.out.printf("[%d]",ar[i]);
        }
        for(int i = 0;i<ar.length;i++)
            if(x == ar[i]){
                ll.add(i+1);
            }
        System.out.println("");
        
        if(ll.isEmpty())
            System.err.println("Value Not Found!");
        else{
            System.out.print("Found ["+x+"] at: ");
            System.out.println(ll.toString());
        }
    }
    
}
