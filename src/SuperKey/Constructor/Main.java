/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKey.Constructor;

/**
 *
 * @author njmah
 */
public class Main {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.Getstudent("NIAJ", 23);
        s1.Display();

        Teachers t1 = new Teachers("MAHMUD", 30);
        ///  t1.Display();

        Depeart_Head D1 = new Depeart_Head("NAZMUL", 30, "CST");
        // D1.Display();
        
        Semester S1= new Semester("Summer",2);

    }

}
