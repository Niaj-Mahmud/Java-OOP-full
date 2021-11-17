
package SuperKey.Constructor;


public class Teachers extends Students {

    String Tname;
    int Tage;

    public Teachers(String n, int a) {
        Getstudent(n, a);
       // System.out.println("" + name);
        this.Display();
        
//    Tage=a;
//    
    }

    @Override
    public void Display() {
         
        super.Display();
       
        //  System.out.println(" name:"+Tname);
//       System.out.println(" name:"+Tage);

    }
}
