/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sony
 */
public class Employee {
    int emp_id;
   String emp_name;
   float basic_salary,salary;
   String grade;
   
   void input() throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter Employee id");
       emp_id=Integer.parseInt(br.readLine());
       System.out.println("Enter Employee name");
       emp_name=br.readLine();
       System.out.println("Enter Employee salary");
       basic_salary=Float.parseFloat(br.readLine());
   }
   void display()
   {
       System.out.println("Employee id is:"+" "+emp_id + " " + "Employee name is:"+" "+emp_name + " " + "Employee salary is:"+" "+basic_salary );
   }
   
   void calSalary()
   {
     salary=basic_salary-((20/100)*basic_salary);
     System.out.println("Salary of Employee is:"+" "+salary );
   }
   
    public static void main(String[] args) throws IOException {
        
        Employee emp[]=new Employee[3];
        for(int i=0;i<emp.length;i++)
        {
            emp[i]=new Employee();
        }
           for(int i=0;i<emp.length;i++)
        {
            emp[i].input();
            emp[i].display();
            emp[i].calSalary();
               
      
        }
     
    }
}
