/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workerlist;

import java.util.Comparator;

/**
 *
 * @author 141638
 */
public class AdjustedSalary extends Worker implements Comparable<AdjustedSalary>{
    private String status;
    private String date;

    public AdjustedSalary(String id, String name, int age, double salary, String place,String status, String date ) {
        super(id, name, age, salary, place);
        this.status = status;
        this.date = date;
    }

    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    @Override
    public String toString() {
        String c = String.format("%-8s %-8s %-8d %-8.2f %-8s %-8s ", id,name,age,salary,status,date);
        return c;
    }
    
 //Sorting 1:
 //Use Comparable<AdjustedSalary>   
    @Override
    public int compareTo(AdjustedSalary t) {
        return Comparator.comparing(AdjustedSalary::getDate)
                .thenComparing(AdjustedSalary::getStatus)
                .thenComparing(AdjustedSalary::getId)
                .compare(this, t);
    }

}
// //Sorting 2:
// //Use Comparator instead of Comparable
// //Replace Collections.sort(ar2) to Collections.sort(ar2, new SortingComparator())
//
//class SortingComparator implements Comparator<AdjustedSalary> { 
//  
//    @Override
//    public int compare(AdjustedSalary a1, AdjustedSalary a2) { 
//
//        // for comparison 
//        int DateCompare = a1.getDate().compareTo(a2.getDate()); 
//        int StatusCompare = a1.getStatus().compareTo(a2.getStatus()); 
//
//        // 2-level comparison using if-else block 
//        if (DateCompare == 0) { 
//            return ((StatusCompare == 0) ? DateCompare : StatusCompare); 
//        } else { 
//            return StatusCompare; 
//        } 
//    } 
//}
