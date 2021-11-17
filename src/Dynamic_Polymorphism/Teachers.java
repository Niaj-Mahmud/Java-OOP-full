package Dynamic_Polymorphism;

public class Teachers extends Students {

    public String qualification;

    Teachers(String n, String v, int a) {
        name = n;
        age = a;
        qualification = v;

    }

    @Override
    public void Display1() {

        System.out.println("Teacher name :" + name);
        System.out.println("Teacher age :" + age);
        System.out.println("Qualification :" + qualification);
        System.out.println("");

    }
    
    public void test() {
        System.out.println("sspe");
    }

}
