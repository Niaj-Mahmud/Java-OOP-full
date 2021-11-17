
package Instance_vs_local_variable;

/**
 *
 * @author njmah
 */
public class Test {
  

    public static void main(String[] args) {
       
        
        
        Teacher teacher1 = new Teacher("NIAJ", "male", 999999);
        //teacher1.SetInformation("NIAJ", "male", 999999);
        teacher1.DisplayInfromation();

        Teacher t2 = new Teacher();
        t2.name = "Mahmud";
        t2.gender = "Male";
        t2.phone = 999900;
        t2.DisplayInfromation();

    }
}
 

