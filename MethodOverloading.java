public class MethodOverloading {

    static String name(String fname){
        return fname;
    }
    static void name(String fname,String lname){
        System.out.println("fullname is "+fname+" "+lname);
    }
    static double name(double a){
        return a/2;
    }
    public static void main(String[] args) {
        System.out.println("firstname is "+name("Suman"));
        name("Suman","Sharma");
        System.out.println("division is "+name(10));
    }
}
