/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Setter_Getter;

/**
 *
 * @author njmah
 */
public class Test {
    
    public static void main(String[] args) {
        
        Encap obj = new Encap();
        
        obj.SetName("NIAJ","20");
        
        obj.dis();
        
        System.out.println(obj.GetName());
    }
    
}
