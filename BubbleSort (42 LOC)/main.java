/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CheckInput ci = new CheckInput();
        BubbleSort bs = new BubbleSort();
        int ar[] = null;
        int n = 0;
        int check = 0;
        
        do{
            System.out.println("======== BubbleSort ========");
            System.out.println("1. Input Elements");
            System.out.println("2. Display Array");
            System.out.println("3. Sort In Ascending Order");
            System.out.println("4. Sort In Descending Order");
            System.out.println("0. Exit");
            n = ci.CheckInput(0,0,4);
            
            switch(n){
                case 1:{
                    System.out.println("--------- Input Elements ---------");
                    System.out.println("Enter size of array: ");
                    int x = ci.CheckInput(3,0,0);
                    ar = new int[x];
                    for(int i = 0;i<ar.length;i++){
                        System.out.print("Element "+(i+1)+" :");
                        ar[i] = ci.CheckInput(2,0,0);
                    }
                    System.err.println("Add Completed!");
                    check = 0;
                    break;
                }
                
                case 2:{
                    if(ar == null)
                        System.err.println("List is empty!");
                    else{
                        System.out.println("--------- Display ---------");
                        System.out.print("Array: ");
                        if(check == 2){
                            for(int i = ar.length-1;i>=0;i--)
                                System.out.printf(" [%d] ",ar[i]);
                        }
                        else{
                            for(int i = 0;i<ar.length;i++)
                                System.out.printf(" [%d] ",ar[i]);
                        }
                        System.out.println("");
                    }
                    break;
                }
                
                case 3:{
                    if(ar == null)
                        System.err.println("List is empty!");
                    else{
                        if(check == 0){
                            bs.sort(ar);
                            System.err.println("Sort Completed!!");
                            check = 1;
                        }    
                        else{
                            check = 1;
                            System.err.println("Sort Completed!!");
                        }
                    }
                    break;
                }
                case 4:{
                    if(ar == null)
                        System.err.println("List is empty!");
                    else{
                        if(check == 0){
                            bs.sort(ar);
                            System.err.println("Sort Completed!!");
                            check = 2;
                        }    
                        else{
                            check = 2;
                            System.err.println("Sort Completed!!");
                        }
                    }
                    break;
                }
            }
        }
        while(n!=0);
        
    }
    
}
