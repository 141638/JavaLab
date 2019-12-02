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
public class Worker  {
    protected String id;
    protected String name;
    protected int age;
    protected double salary;
    protected String place;

    public Worker(){}
    
    public Worker(String id, String name, int age, double salary, String place) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.place = place;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    @Override
    public String toString() {
        String s;
        s = String.format("%-8s %-8s %-8d %-8.2f %-8s ", id,name,age,salary,place);
        return s;
    }

  
}    
class SortById implements Comparator<Worker>{
    @Override
    public int compare(Worker t, Worker t1) {
        return t.getId().compareTo(t1.getId());
    }
    
}
  