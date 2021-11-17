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
public class Test {

    public static void main(String[] args) {
       
        
        
        Teacher teacher1 = new Teacher("NIAJ", "male", 999999);
        //teacher1.SetInformation("NIAJ", "male", 999999);
       // teacher1.DisplayInfromation();

        Teacher t2 = new Teacher();
        t2.name = "Mahmud";
        t2.gender = "Male";
        t2.phone = 999900;
       // t2.DisplayInfromation();

    }
}
