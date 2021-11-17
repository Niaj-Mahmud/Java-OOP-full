/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author njmah
 */
public class Seller extends User {

    public int hello = 10;
    private int result;

    @Override
    public void Add(int a, int b) {
        result = a + b;
        //return result;
    }

    @Override
    public int result() {
        return result + 5;
    }
    
  

    public void checkMethod() {
        System.out.println("Test method");
    }

}
