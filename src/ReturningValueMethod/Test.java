/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReturningValueMethod;

/**
 *
 * @author njmah
 */
public class Test {
    
    public static void main(String[] args) {
        ReturnValue obj= new ReturnValue();
        
        int result= obj.square(5);
        
                System.out.println("Addison = "+result);
                
                
         ReturnValue add = new ReturnValue();
         System.out.println("Add = "+obj.square(result));
    }
    
}
