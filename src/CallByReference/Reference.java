/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallByReference;

/**
 *
 * @author njmah
 */
public class Reference {
    
    String name;
    
    void method(Reference r1){
        
        r1.name="Mahmud";
        
        
  
    
    
    }
    void display(){
          System.out.println("Chnage in local :"+name);
    }
}
