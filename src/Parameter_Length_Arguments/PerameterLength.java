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
public class PerameterLength {  
    
    void Add(double ... num){
        
        double sum =0;
        for(double x:num){
            sum = sum +x;
            
        
        }
        System.out.println("total:"+sum);
    
    }
    
}
