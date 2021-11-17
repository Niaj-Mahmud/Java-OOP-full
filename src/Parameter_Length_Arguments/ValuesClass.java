/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parameter_Length_Arguments;

/**
 *
 * @author njmah
 */
public class ValuesClass {
    
    public static void main(String[] args) {
        
        PerameterLength obj= new PerameterLength();
        
        obj.Add(2,3);
        obj.Add(2,3,4);
        obj.Add(2,3,5.5);
        obj.Add(2,3,5,6.9085686753545476);
        obj.Add(2);
        
    }

    
    
}
