/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CheckInput {
    Scanner sc = new Scanner(System.in);
    
    int CheckInput(int a,int min,int max){
        String Numtext;
        do{
            Numtext = sc.nextLine();
            try{
                if(a==0){
                    if(Numtext.matches("[0-9]+")){
                        a = Integer.parseInt(Numtext);
                        if(a>=min && a<= max)
                        break;
                    }
               }
                else if(a==1){
                    if(Numtext.matches("[-]?[0-9]+")){
                        a = Integer.parseInt(Numtext);
                        break;
                   }    
                }
                else{
                    if(Numtext.matches("[1-9]+[0-9]*")){
                        a = Integer.parseInt(Numtext);
                        break;
                    }    
                }
           } 
           catch(ArithmeticException e){}System.err.println("Error!!");
        }
        while(true);
        return a;
    }
    
}
