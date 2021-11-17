/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author njmah
 */
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        
        t1.GetTeacher("MAHMUD","MSC IN CST",38);
        
        t1.Display2();
        
        System.out.println("");
        
        
        Students s1= new Students();
        s1.get("NIAJ",23);
        
        s1.Display1();
        
    }
    
}
