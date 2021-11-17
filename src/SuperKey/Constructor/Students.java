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
public class Students {

    String name;
    int age;

    public void Getstudent(String nnn, int aaaa) {
        name = nnn;
        age = aaaa;
    }

    public void Display() {
        System.out.println(" name :" + name);
        System.out.println(" age :" + age);

    }

}
