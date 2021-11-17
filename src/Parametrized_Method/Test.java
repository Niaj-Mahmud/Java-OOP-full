/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parametrized_Method;

/**
 *
 * @author njmah
 */
public class Test {
    public static void main(String[] args) {

        ParametrizTeacher teacher1 = new ParametrizTeacher();
        teacher1.SetInformation("NIAJ","male",99);
        teacher1.DisplayInfromation();

        ParametrizTeacher t2 = new ParametrizTeacher();
        t2.name = "Mahmud";
        t2.gender = "Male";
        t2.phone = 999900;
        t2.DisplayInfromation();
        
        key k1= new key();
        k1.para("MAHMUD", "Male", 543, 23);

    }
    
}
