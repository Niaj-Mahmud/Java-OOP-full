/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method_Overrideing;

/**
 *
 * @author njmah
 */
public class Teachers extends Students {
      public String qualification;
    
    
    public void GetTeacher(String s, String q,int a){

        name=s;
        age=a;
        qualification=q;
        
        
    }
//    public void Display(){
//    
//        System.out.println("Teacher name :"+name);
//        System.out.println("Teacher age :"+age);
//        System.out.println("Qualification :"+qualification);
//        
//    }

    @Override
    public void Display1() {
         System.out.println("Teacher name :"+name);
         System.out.println("Teacher age :"+age);
         System.out.println("Qualification :"+qualification);  //To change body of generated methods, choose Tools | Templates.
    }
    
    


}
