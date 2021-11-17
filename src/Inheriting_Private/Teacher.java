/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheriting_Private;

/**
 *
 * @author njmah
 */
public class Teacher extends Student {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
     public void TchDisplay(){
        System.out.println(getName());
        System.out.println("teacher age:"+getAge());
        System.out.println(getQualification());
     }
    
}
