/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author njmah
 */
public class Teacher extends Students {
    
    public String qualification;
    
    
    public void GetTeacher(String s, String q,int a){

        name=s;
        age=a;
        qualification=q;
        
        
    }
    
      public void Display2(){
    
        System.out.println("Teacher name :"+name);
        System.out.println("Teacher age :"+age);
        System.out.println("Qualification :"+qualification);
        
    }
    
}
