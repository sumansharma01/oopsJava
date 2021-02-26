
class ParentClass {
    int calculate(int a,int b){
        return a+b;
    }

}
class ChildClass extends ParentClass{
    int calculate(int a,int b){
        return a-b;
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        ParentClass p=new ParentClass();
        System.out.println(p.calculate(10,5));

        ChildClass c=new ChildClass();
        System.out.println(c.calculate(10,5));

        ParentClass second=new ChildClass();
        System.out.println(second.calculate(10,5));

        ParentClass third=(ParentClass) new ChildClass();
        System.out.println(third.calculate(10,5));

    }
}
