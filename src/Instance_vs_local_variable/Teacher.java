/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instance_vs_local_variable;

/**
 *
 * @author njmah
 */

public class Teacher {
        String name,gender;
    long phone;
    
    
    Teacher(String name, String gender, long phone){
    this.name=name;
    this.gender=gender;
    this.phone=phone;
    
    }
    
    Teacher(){}
    
    
    void DisplayInfromation(){
          System.out.println("name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("phone :"+phone);
    }
}

    

