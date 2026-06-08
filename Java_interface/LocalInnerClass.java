/*
a local inner is a class which is written in a block of code like a function body
it is hidden from the world will be created
the method variable it uses should be final evetnually
and also it can acess the variables and methods of outer class
it cannot have acces modifiers
because its scope is already restricted to method



-------------------------------------------------------------------------------------------------------------------------------
ANONYMOUS function
Anonymous class aere class which have no name and are used when you want to implment interfsace which runs only once
and you dont want to create a separte .java file for it
* */

interface Anonymous_interface{
    public void run();
}
class Anonymous{
    public void printRun(){
        Anonymous_interface ai=new Anonymous_interface() {
            @Override
            public void run() {
                System.out.println("this is annonymous interface code");
            }
        };
    }
//clonable // marker interface // comparable interface
    //
}
class Parent{
    final int xyz=0;
    int p=8;
    public void InnerFunction(){
        final String str="Sarthak";
        class InnerChild{
            public void Getdetails() {
                System.out.println(xyz);
                System.out.println(p);
                System.out.println(str);
            }
        }
        InnerChild A=new InnerChild();
        A.Getdetails();
    }
}
public class LocalInnerClass {
    public static void main(String args[]){
        Parent P=new Parent();
        P.InnerFunction();
    }
}
