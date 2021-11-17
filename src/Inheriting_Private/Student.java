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
public class Student {
    
    
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void StDisplay(){
        System.out.println(name);
        System.out.println(age);
    
    
    }
    
}
