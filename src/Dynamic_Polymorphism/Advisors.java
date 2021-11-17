/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Polymorphism;

/**
 *
 * @author njmah
 */
public class Advisors extends Students {
    
    String Depart;
    
         Advisors(String n, String v, int a){
            name=n;
            age=a;
            Depart= v;
            
     
     }
         
    @Override
         public void Display1(){
         System.out.println("Advisor name :"+name);
        System.out.println("Advisor age :"+age);
        System.out.println("Department :"+Depart);
        System.out.println("");
         
         
         }
    
}
