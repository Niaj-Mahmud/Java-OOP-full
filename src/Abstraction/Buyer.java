
package Abstraction;

public class Buyer extends User {
 private int result;
    @Override
    public void Add(int a, int b) {
        result = a+b;
        //return a*b;    
    }

    @Override
    public int result() {
        return result - 20;
    }
    
    
}
