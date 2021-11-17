/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method_Overrideing;

//import Inheritance.Teacher;
/**
 *
 * @author njmah
 */
public class Main {

    public static void main(String[] args) {
        Teachers t1 = new Teachers();

        t1.GetTeacher("MAHMUD", "MSC IN CST", 38);

        t1.Display1();

        System.out.println("");

        Students s1 = new Students();
        s1.get("NIAJ", 23);

        s1.Display1();
        
        
        s1= new Teachers();
        s1.Display1();

    }
}
