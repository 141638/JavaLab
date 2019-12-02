/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workerlist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 141638
 */
public class Manage {
    Scanner sc = new Scanner(System.in);
    CheckInput ci = new CheckInput();
    
    void addWorker(ArrayList ar){
        
        System.out.print("Enter Id: ");
        String id = ci.checkID(ar);
        
        System.out.print("Enter Name: ");
        String name = ci.checkName();
        
        System.out.print("Enter Age: ");
        int age = ci.checkAge();
        
        System.out.print("Enter Salary: ");
        double salary = ci.checkSalary();
        
        System.out.println("Enter Work Location: ");
        String wl = sc.nextLine();
        
        ar.add(new Worker(id, name, age, salary, wl));
        System.err.println("Add Completed!");
    }
    
    void UpDownSalary(ArrayList<Worker> ar1, ArrayList<AdjustedSalary> ar2, int n ){
        
        double r = 0;
        String status = null;
        Worker w;
        System.out.println("Enter ID: ");
        w = ci.checkID2(ar1);
        
        if(w!= null){
            System.out.println("Enter Salary: ");
            double salary = ci.checkSalary();
            
            Date today = Calendar.getInstance().getTime();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String stringDate = df.format(today);
            
            switch(n){
                case 1:{
                    r = salary + w.getSalary();
                    w.setSalary(r);
                    System.err.println("Up Completed!");
                    status = "UP";
                    break;
                }
                
                case 2:{
                    r = w.getSalary() - salary;
                    if(r<0) r = 0;
                    w.setSalary(r);
                    System.err.println("Down Completed!");
                    status = "DOWN";
                    break;
                }
            }
            
            ar2.add(new AdjustedSalary(w.getId(), w.getName(), w.getAge(), r,null, status, stringDate));
        }
        else System.err.println("ID Not Found!");
        
        
    }
}
