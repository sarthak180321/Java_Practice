class A {
    {

    }
    void peek() {
        System.out.println('p');
    }
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void shake() {
        System.out.println("sjfgtj");
    }
    void show() {
        System.out.println("B");
    }
    public String toString(){
      return "Hello";
    }

}
public class Maiin {
    public static void main(String args[]){
        B obj = new B();
        obj.shake();
        System.out.println(obj);
        System.out.println(obj.toString());
    }
}
