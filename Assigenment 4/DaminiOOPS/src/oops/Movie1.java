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
public class Movie1 {
      int reviews;
   String moviename,actorname,actressname;
  
   void display()
   {
       System.out.println(reviews + " " + moviename + " " + actorname+" "+ actressname);
   }
  
   
    public static void main(String[] args) {
        Movie1 m=new Movie1();
        Movie1 m1=new Movie1();
        Movie1 m2=new Movie1();
    m.reviews=4;
    m.moviename="Kick";
    m.actorname="Salman Khan";
    m.actressname="Jacklin";
    m1.reviews=4;
    m1.moviename="Happly New Year";
    m1.actorname="Sharukh Khan";
    m1.actressname="Deepika";
    m2.reviews=3;
    m2.moviename="Bajirao Mastani";
    m2.actorname="Ranvir Singh";
    m2.actressname="Deepika";
    
        m.display();
        m1.display();
        m2.display();
        
    }
}
