package ConstructorsInAbstractClass;

abstract class Area{
    double l,b;
    Area(double l,double b){
        this.l=l;
        this.b=b;
    }
    Area(double l){
        this.l=l;
    }
    abstract void display();
}

class Square extends Area{
    Square(double l) {
        super(l);
    }

    void display(){
        System.out.print("Area of square= ");
    }
}
class Rectangle extends Area{
    Rectangle(double l,double b){
        super(l,b);
    }
    void display(){
        System.out.print("Area of rectangle= ");
    }
}

public class Example {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(5,10);
        rectangle.display();
        System.out.println(rectangle.l* rectangle.b);

        Square square=new Square(8);
        square.display();
        System.out.println(square.l* square.l);
    }
}
