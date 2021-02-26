package NestedInterface;

interface Parent{
    void display();
    interface NestedParent{
        void display();
    }
}

class A implements Parent{

    @Override
    public void display() {
        System.out.println("I am in parent interface");
    }
}

class B implements Parent.NestedParent{

    @Override
    public void display() {
        System.out.println("I am inside nested parent");
    }
}
public class Main{
    public static void main(String[] args) {
        A a=new A();
        a.display();

        B b=new B();
        b.display();
    }
}