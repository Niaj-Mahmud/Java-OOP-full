package Parametrized_Method;

/**
 *
 * @author njmah
 */
public class ParametrizTeacher {

    String name, gender;
    long phone;

    void SetInformation(String n, String m) {
        name = n;
        gender = m;

        System.out.println();
    }

    void SetInformation(String n, String m, int ph) {
//         name=n;
//         gender=m;
        this.SetInformation(n, m);
        phone = ph;
        System.out.println();
    }

    void DisplayInfromation() {
        System.out.println("name :" + name);
        System.out.println("gender :" + gender);
        System.out.println("phone :" + phone);
    }

}
