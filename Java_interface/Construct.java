class Testing {
    String ans;
    int num;

    private Testing(){
        this(10);  // ✅ first statement
        System.out.println("this is the private constructor");
    }

    private Testing(int id){
        this("sarthak");  // ✅ first statement
        this.num = 10;
        System.out.println("this is the private constructor");
    }

    private Testing(String ans){
        this.ans = ans;
        System.out.println("this is the private constructor");
    }

    public static Testing getInstance(){
        return new Testing();
    }
}
class Person{
    int id;
    Person(int id){
        this.id=id;
        System.out.println("person constructor with id "+id);
    }
}
class Manager extends Person{
    Manager(){
        super(10);
        System.out.println("manager constructor");
    }
}
public class Construct {
    public static void main(String args[]){
        Testing t1 = Testing.getInstance();
        System.out.println(t1);
        Manager m1=new Manager();
    }
}