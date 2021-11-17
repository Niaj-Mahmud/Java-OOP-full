/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author njmah
 */
public class Teacher {
        String name,gender;
    long phone;
    
    
   public Teacher(String n, String g, long ph){
    name=n;
    gender=g;
    phone=ph;
    
    }
    
    Teacher(){
    
            System.out.println("gender :hghjjhjhj");
}
    
    
    void DisplayInfromation(){
          System.out.println("name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("phone :"+phone);
    }
}
