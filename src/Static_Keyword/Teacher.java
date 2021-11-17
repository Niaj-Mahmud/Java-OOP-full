
package Static_Keyword;


public class Teacher {

    String name;
    int age;
    static String university = "NJUPT";

    static int count = 0;

    Teacher() {

    }

    Teacher(String n, int i) {
        name = n;
        age = i;
        count++;
    }

    void DisplayInformation() {

        System.out.println("name :" + name);
        System.out.println("gender :" + age);
        System.out.println("phone :" + university);
        //  System.out.println("phone :"+university);

    }

}
