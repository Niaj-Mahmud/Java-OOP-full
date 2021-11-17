/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheriting_Private;


public class Main {
    public static void main(String[] args) {
        
       Teacher t1 = new Teacher();
       
       t1.setName("NIAJ");
       t1.setAge(23);
       t1.setQualification("BSc CST");
       
       
       
       
       t1.StDisplay();
       t1.TchDisplay();
    }
    
}
