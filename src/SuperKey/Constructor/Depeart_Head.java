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
public class Depeart_Head extends Teachers {

    String Dept;

    public Depeart_Head(String n, int a, String d) {
        super(n, a);
        Dept = d;
        System.out.println("dept H :" + Dept);
    }

//  
//    @Override
//    public void Display(){
//        
//        super.Display();
//        System.out.println("deprtmant:"+Dept);        
//    
//    }
}
