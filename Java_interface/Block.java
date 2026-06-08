class A{
    A(){
        System.out.println("A constructor");
    }
    static {
        System.out.println("a static bloc");
    }
    {
        System.out.println("INstance block a");
    }
}
class B extends A{
    B(){
        this(10);
        System.out.println("B empty constructor");
    }
    B(int x){
        super();
        System.out.println("B  value constructor");
    }
    static {
        System.out.println("b static block");
    }
    {
        System.out.println("INstance block B");
    }
}
public class Block {
    public static void main(String[] args){
        B x=new B();
    }
}
