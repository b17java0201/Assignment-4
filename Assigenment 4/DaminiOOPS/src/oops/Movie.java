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
public class Movie {
    int reviews;
   String moviename,actorname,actressname;
  
   
   void input() throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter movie reviews");
       reviews=Integer.parseInt(br.readLine());
       System.out.println("Enter your Movie name");
       moviename=br.readLine();
        System.out.println("Enter your Actor name");
       actorname=br.readLine();
        System.out.println("Enter your Actres sname");
       actressname=br.readLine();
   }
   void display()
   {
       System.out.println(reviews + " " + moviename + " " + actorname+" "+ actressname);
   }
  
   
    public static void main(String[] args) throws IOException {
        Movie m=new Movie();
        Movie m1=new Movie();
        Movie m2=new Movie();
        m.input();
        m1.input();
        m2.input();
        m.display();
        m1.display();
        m2.display();
        
    }
   
    
}
