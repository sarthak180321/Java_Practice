class Wrapper{
    Wrapper(){
        System.out.println("this is the constructir of your class normally");
    }
    static{
        System.out.println("this beloings to static block");
        // runs on loadinf of the static class
    }
    static int mymethod(){
        System.out.println("this is mehod static ");
        return 56;
    }
    public static void main(String args[]){
        int a=10;
        byte b=(byte)a; //explicit type cast
        System.out.println(b);
        Wrapper m=new Wrapper();
        Wrapper.mymethod();

    }
}