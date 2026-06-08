interface adapter{
    static int a=10;
    public static void mymethod(){
        System.out.println("static fucntion workw with body"+a);
    }
    default void m2(){
        System.out.println("this method is default method");
    }
    public void over();
}
class Adp implements adapter{
    @java.lang.Override
    public void over() {
        System.out.println("this function was overrrident by ");
    }

}
//Function<Integer,Integer>sqaure=(a)-> a*a;
class Myclass{
    static  int temp=10;
    int comp;
    Myclass(int amp){
        this.comp=amp;
        System.out.println("this is final class ");
    }
}
class Child extends Myclass{
    Child(){
        super(10);
        System.out.println("can this be extended");
    }
}
public class Interfacecl{
    public static void main(String args[]){
        Adp obj=new Adp();
        adapter.mymethod();
        System.out.println(adapter.a);
        obj.over();
        Myclass obj2=new Myclass(10);
        System.out.println(obj2.comp);
        Child c1=new Child();

    }
}


