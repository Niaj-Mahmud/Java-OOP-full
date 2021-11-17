/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Polymorphism;

/**
 *
 * @author njmah
 */
public class Main {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.Display1();

        s1 = new Teachers("Mahmud", "MSc ", 35);
        s1.Display1();

        s1 = new Advisors("David", "CST", 40);
        s1.Display1();

       
        
        //
        
        System.out.println("USING ARRAY ");
        Students[] A = new Students[3];

        A[0] = new Students();

        A[1] = new Teachers("Mahmud", "Msc ", 25);

        A[2] = new Advisors("David", "CST", 40);
        
        for (int i = 0; i <3; i++) {
              A[i].Display1();
        }

//        A[0].Display1();
//        A[1].Display1();
//        A[2].Display1();

    }

}
