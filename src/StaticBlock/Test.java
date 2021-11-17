/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticBlock;

/**
 *
 * @author njmah
 */
public class Test {
    
    static int i;
    static String w;
    
    static{
    i=10;
    w="write";
    
        System.out.println("check block");
    
    }
    
    
    void print(){
        
        System.out.println("prints");
    
    }
    
   static void Display(){
       System.out.println(""+i);
       System.out.println(""+w);
       
       
    
    }
   
    public static void main(String[] args) {
        
        Test.Display();
    }
    
}
