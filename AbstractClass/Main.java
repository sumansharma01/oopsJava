package AbstractClass;

abstract class Toyota{
    int averageMileage=10;
    void brand(){
        System.out.print("Toyota ");
    }

    abstract void model();
    abstract void mileage();
    abstract double mileage(int m);
}

abstract class Camry extends Toyota{

    @Override
    void model() {
        System.out.print("Corolla ");
    }

    @Override
    void mileage() {
        System.out.print("12km ");
    }
}

class GrandChild extends Camry{

    @Override
    double mileage(int m) {
        return averageMileage+m;
    }
}



public class Main {
    public static void main(String[] args) {

        Toyota camry=new GrandChild();

        camry.brand();
        camry.model();
        camry.mileage();
        System.out.print("average+mileage= "+camry.mileage(12));



    }
}
