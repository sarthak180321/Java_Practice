// the multibound class will accepti only those type which extend the Animal class and implemet cloning and Serializable 
interface Serializable{
    public void serialize();
}
interface  Cloning{
    public void clonee();
}
class Animal{
    public void Sound(){
        System.out.println("this is aniumal class ");
    }
    public void Breathing(){
        System.out.println("thsi animal is breathing heavily");
    }
}
class Dog extends Animal implements Serializable,Cloning{
    @Override
    public void serialize(){
        System.out.println("this is serialization of obkect ");
    }
    @Override
    public void clonee(){
        System.out.println("this is also cloning of object");
    }
}
class MultiBound<T extends Animal & Serializable & Cloning>{
    T Variable;
    MultiBound(T x){
        this.Variable=x;
    }
    public void doAll(){
        Variable.Breathing();
        Variable.clonee();
        Variable.serialize();
        Variable.Sound();
    }
    T getValue(){
        return Variable;
    }

}
public class Generics {
    public static void main(String args[]){
    MultiBound<Dog> m1=new MultiBound<>(new Dog());
    m1.doAll();
    System.out.println(m1.getValue());
    }
}
