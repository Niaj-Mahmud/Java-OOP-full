
package Static_Keyword;


public class Test {
    
    public static void main(String[] args) {
        Teacher t1= new Teacher("NIAJ",24);
                    System.out.println("total:"+Teacher.count);
        t1.DisplayInformation();

         Teacher t2= new Teacher("AJ",24);
        
        t1.DisplayInformation();
        
            System.out.println("total:"+Teacher.count);        
        //static value without object
        System.out.println("static value :"+Teacher.university);
        
    }
    
}
