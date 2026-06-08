interface MyLambda{
    int multi(int a,int b);
}

interface Runable{
    public void run();
}
class Xyz{
    Xyz(){
        System.out.println("Ghoda bhen ka loda ");
    }
}
interface Ghoda{
    int a=10;
    public Xyz mythod();
}
public class Lambda{
    public static void main(String[] args){
    Runable r=new Runable() {
        @java.lang.Override
        public void run() {
            System.out.println("anonymos function created wth anon clas s");
        }
    };
    r.run();
        Runable r1=()->{
            System.out.println("this is easy lamda function");
        };
        r1.run();

//        new Thread(new Runable(){
//            @java.lang.Override
//            public void run() {
//                System.out.println("thread is running independently");
//            }
//        }).start();
        MyLambda l1=(a,b)->a*b;
        int ans= l1.multi(10,20);
        System.out.println(ans);
        Ghoda G1=()->{
            return new Xyz();
        };
        System.out.println(G1.a);
    }
}