/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method_Overloading;

public class Overload {
    
    
//    void add(int a, int b){
//        System.out.println(a+b);
//    }
    
    void add(double a, double b){
        System.out.println(""+a*b);
    }
    
    
    void add(int pos,double num ,long age){
        System.out.println(""+pos/num);
    }
    
    void add(int z,int y,int x){
        
        System.out.println("string to int :"+z+y+x);
    
    }
    
}
