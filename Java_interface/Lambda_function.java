interface Functional{
    public void myFunc();
}
public class Lambda_function {
    public static void main(String args[]){
        Functional fn=()->{
            System.out.println("aur sunao kya hal hai mc dalle");
        };
        fn.myFunc();
        Runnable T1=()->{
            System.out.println("this is a thread with lambda function");
        };

        Thread mythread=new Thread(T1);
        mythread.start();
        new Thread(()->{
            System.out.print("this is my second small thread");
        }).start();
    }
}
