/**
 *
 * @author 141638
 */
public class main {

    static int fib(int n) { 
        if (n ==0 || n == 1) 
           return n; 
        return fib(n-1) + fib(n-2); 
    } 
    
    public static void main(String[] args) {
        System.out.println("The 45 sequence of Fibonacci: ");
        for(int i = 0;i<45;i++){
            if(i%2==0)
                System.out.println("");
            System.out.printf(" [%d] ", fib(i));
        }    
        System.out.println("");
    }
}
