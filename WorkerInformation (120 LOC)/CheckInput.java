/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workerlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 141638
 */
public class CheckInput {
    Scanner sc = new Scanner(System.in);
    
    
    
    int checkOption(){
        String NumText;
        int n = 0;
        do{
            NumText = sc.nextLine();
            try{
                if(NumText.matches("[0-9]+"))
                    n = Integer.parseInt(NumText);
                    if(n>=0 && n <= 5)
                        break;
            } catch (Exception e) {} System.err.println("Invalid Input!!");
        }
        while(true);
        return n;
    }
    String checkID(ArrayList<Worker> ar){
        String s;
        boolean check = true;
        do{
            s = sc.nextLine();
            try{
                if(s.matches("[a-z A-Z]*[0-9]*"))
                    if(!s.isEmpty() && !s.equals("//s")){
                        if(IdExist(ar, s))
                            System.err.println("ID Existed!");
                        else break;
                    }
                
               
            } catch (Exception e) { System.err.println("Invalid Input!!");}
        }
        while(true);
        return s;
    }
    boolean IdExist(ArrayList<Worker> ar,String s){
        int n = ar.size();
        for(int i = 0;i<n;i++)
            if(ar.get(i).getId().equalsIgnoreCase(s))
                return true;
        return false;
    }
    
    Worker checkID2(ArrayList<Worker> ar){
        String s;
        boolean check = true;
        do{
            s = sc.nextLine();
            try{
                if(s.matches("[a-z A-Z]*[0-9]*"))
                    if(!s.isEmpty() && !s.equals("//s")){
                        for(int i = 0 ;i<ar.size();i++)
                            if(ar.get(i).getId().equalsIgnoreCase(s))
                                return ar.get(i);
                        break;
                    }
            } catch (Exception e) {} System.err.println("Invalid Input!!");
        }
        while(true);
        return null;
    }
    String checkName(){
        String name;
        do{
            name = sc.nextLine();
            try {
                if(name.matches("[a-zA-Z]*")){
                    if(name.isEmpty() || name.equals("//s")){
                        System.err.println("Please Enter Name!");
                        continue;
                    }
                    else break;
                }
            } catch (Exception e) {System.out.println("Invalid Input");} 
        }
        while(true);
        return name;
    }
    
    int checkAge(){
        int c = 0;
        String Numtext;
        do{
            Numtext = sc.nextLine();
            try{
                if(Numtext.matches("[0-9]+")){
                   c = Integer.parseInt(Numtext);
                    if(c >= 18 && c <= 50)
                       break;
                }
            } 
            catch(ArithmeticException e){}System.err.println("Age must be in range 18 to 50!");
        }
        while(true);
        return c;
    }
    
    double checkSalary(){
        double c;
        String Numtext;
        do{
            Numtext = sc.nextLine();
            try{
                if(Numtext.matches("[0-9]*[.]?[0-9]+")){
                   c = Double.parseDouble(Numtext);
                    if(c > 0)
                       break;
                    else continue;
                }
            } 
            catch(ArithmeticException e){}System.err.println("Salary > 0!!");
        }
        while(true);
        return c;
    }
    
}
