/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Key;

/**
 *
 * @author njmah
 */
public class Test_final {

    final int a = 123;
    static final int b = 345;

    final String Sh;
    static final String Age;

    static {
        Age = "twenty";

    }

    public Test_final() {
        this.Sh = "NIAJ MAHMUD";
    }
    
   final void Check(){
    
    }

    void Display() {
        System.out.println("Number :" + a);
        System.out.println("Name :" + Sh);
        System.out.println("Age :" + Age);
        System.out.println("int 2 :" + b);

    }

}
