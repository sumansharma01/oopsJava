public class Example1 {
    String firstName;
    String lastName;
    int x;
    double a,b;
    Example1(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    Example1(int x){
        this.x=x;
    }
    Example1(double a,double b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(this.firstName+" "+this.lastName);
    }
    void displayArea(){
        System.out.println("Area of square=" +this.x*this.x);
    }
    void displayRectangleArea(){
        System.out.println("Area of rectangle="+this.a*this.b);
    }
    public static void main(String[] args) {
        Example1 person1=new Example1("Suman","Sharma");
        person1.display();
        Example1 area=new Example1(3);
        area.displayArea();

        Example1 areaOfReactangle=new Example1(5,10);
        areaOfReactangle.displayRectangleArea();
    }
}
