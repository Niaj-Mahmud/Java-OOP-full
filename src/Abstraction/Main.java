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
public class Main {

    public static void main(String[] args) {
        User E1;

        E1 = new Buyer();
        E1.Add(10, 4);
        System.out.println("Buyer RE :" + E1.result());
        E1.printResult();

        Seller e1 = new Seller();
        e1.Add(2, 2);
        e1.printResult();
        //System.out.println("Seller :"+S);
      
        //E1.Result(S, S)

    }

}
