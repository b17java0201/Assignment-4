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
public class Student {

   int roll_no;
   String name;
   float marks;
   String grade;
   
   void input() throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your roll_no");
       roll_no=Integer.parseInt(br.readLine());
       System.out.println("Enter your name");
       name=br.readLine();
       System.out.println("Enter your marks");
       marks=Float.parseFloat(br.readLine());
   }
   void display()
   {
       System.out.println(roll_no + " " + name + " " + marks );
   }
   
   String findGrade()
   {
       if(marks>=75 && marks<=100)
           grade="Good";
       else
           grade="Average";
       return grade;
   }
   
    public static void main(String[] args) throws IOException {
        Student s=new Student();
        Student s1=new Student();
        s.input();
        s1.input();
        s.display();
        s1.display();
        System.out.println(s.findGrade());
        System.out.println(s1.findGrade());
    }
    
}
