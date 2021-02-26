package InterfaceExample;

interface Parent{
    int averageMileage=10;
    void model();
    int mileage();
    static int mileage(int n){
        return n;
    }
}

interface ParentSecond extends Parent{
    void display();
}

class Toyota{
    void brand(){
        System.out.print("Toyota ");
    }
}

class Camry extends Toyota implements ParentSecond{

    @Override
    public void model() {
        System.out.print("Camry ");
    }

    @Override
    public int mileage() {
        return 10;
    }


    @Override
    public void display() {
        System.out.println("I am in second parent class");
    }
}



class Main{
    public static void main(String[] args) {
        Camry camry=new Camry();
        camry.brand();
        camry.model();

        System.out.println(Parent.mileage(8)+camry.mileage());
        System.out.println("");
        camry.display();
    }
}

