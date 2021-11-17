/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author njmah
 */
public abstract class User {
    
    
   public abstract void Add(int a, int b);
   
   public abstract int result();
   
   public void printResult() {
       Add(0, 0);
       result();
               
       System.out.println("Result:" + result());
   }
   
   
    
}
