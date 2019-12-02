/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workerlist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 141638
 */
public class Main {

    public static void main(String[] args) {
        
        int n = 0;
        
        Worker w = new Worker();
        CheckInput ci = new CheckInput();
        ArrayList<Worker> ar = new ArrayList<>();
        ArrayList<AdjustedSalary> ar2 = new ArrayList<>();
        Manage mn = new Manage();
        
// //Use to check bug in list 1         
//        ar.add(new Worker("W01", "Nam", 18, 2000, "HL"));
//        ar.add(new Worker("W02", "Tung", 14, 1200, "HN"));
//        ar.add(new Worker("W03", "Quang", 21, 3000, "LC"));
//        ar.add(new Worker("W00", "Tu", 27, 2600, "LC"));
        
        
// //Use to check bug in list 2        
//        ar2.add(new AdjustedSalary("W01", "Nam", 18, 2100,null, "UP","18/12/2000"));
//        ar2.add(new AdjustedSalary("W02", "Tung", 14, 1000,null, "Down","11/12/2000"));
//        ar2.add(new AdjustedSalary("W03", "Quang", 21, 2000,null, "Down","11/12/2000"));
//        ar2.add(new AdjustedSalary("W04", "Hieu", 21, 3000,null, "Up","18/12/2000"));
//        ar2.add(new AdjustedSalary("W00", "Dung", 25, 2000,null, "Down","18/12/2000"));
 
        do{
            System.out.println("---- Worker Menu ----");
            System.out.println("1. Add Worker");
            System.out.println("2. Up Salary");
            System.out.println("3. Down Salary");
            System.out.println("4. Display Worker List");
            System.out.println("5. Display History");
            System.out.println("0. Exit");
            System.out.println("Option: ");
            n = ci.checkOption();
            
            switch(n){
                case 1:{
                    System.out.println("---- Add Worker ----");
                    mn.addWorker(ar);
                    break;
                }
                
                case 2:{
                    System.out.println("---- Up Salary ----");
                    mn.UpDownSalary(ar, ar2, 1);
                    break;
                }
                
                case 3:{
                    System.out.println("---- Down Salary ----");
                    mn.UpDownSalary(ar, ar2, 2);
                    break;
                }
                
                case 4:{
                    if(ar.isEmpty())
                        System.err.println("List Is Empty!");
                    else{
                        System.out.println("----------- Worker Information -----------");
                        System.out.printf("%-8s %-8s %-8s %-8s %-8s","ID","Name","Age","Salary","WorkLocation");
                        Collections.sort(ar, new SortById());
                        System.out.println("");
                        for(int i = 0;i<ar.size();i++)
                            System.out.println(ar.get(i).toString());
                    }
                    break;
                }
                case 5:{
                    if(ar2.isEmpty())
                        System.err.println("List Is Empty!");
                    else{
                        System.out.println("----------- Worker Information -----------");
                        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s","ID","Name","Age","Salary","Status", "Date");
                        Collections.sort(ar2);
                        System.out.println("");
                        for(int i = 0;i<ar2.size();i++)
                            System.out.println(ar2.get(i).toString());
                    }
                    break;
                }
                
                
            }
        }
        while (n != 0);
    }
    
}
