/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method_Overrideing;

/**
 *
 * @author njmah
 */
public class Students {
      public String name;
    public int age;
    
    
    public void get(String n,int a){
            name=n;
            age=a;
    }
    
    
    public void Display1(){
    
        System.out.println("Student name :"+name);
        System.out.println("Student age :"+age);
    }
    
}
