class Parent{
    Parent(){
        System.out.println("I am in parent class");
    }
    Parent(String s, String t){
        System.out.println("I am in parent class with parameters");
    }
}
class Child extends Parent{
    Child(){

        System.out.println("I am in child class!");
    }
}

class GrandChild extends Child{
    GrandChild(){
        System.out.println("I am in grand child class");
    }
}

class SecondChild extends Parent{
    SecondChild(){
        super("suman","sharma");
        System.out.println("I am in secondChild class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        GrandChild c=new GrandChild();

        System.out.println("========================");

        SecondChild sc=new SecondChild();

    }
}
