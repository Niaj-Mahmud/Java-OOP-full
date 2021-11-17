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
public class TestRef {
    public static void main(String[] args) {
        
        Reference rt= new Reference();
            rt.name="NIAJ";
            
            System.out.println("before call :"+rt.name);
            
            rt.method(rt);
            System.out.println("after call :"+rt.name);

            
         
            rt.display();
    }
    
}
