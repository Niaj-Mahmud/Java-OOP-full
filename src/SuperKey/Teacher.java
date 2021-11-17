/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKey;

/**
 *
 * @author njmah
 */
public class Teacher extends Student {

    String ql;

    void getTech(String n, int i, String j) {
        name = n;
        age = i;
        ql = j;

    }
    
    @Override
    public void Display1(){
        
        super.Display1();
        
       
    
    System.out.println("Student name :"+name);
        System.out.println("Student age :"+age);
        System.out.println("Student age :"+ql);
    
    }

}
