//autoboxing conversion from primitive to Object tyoe if data
// unboxing conversionn Object to primitive
//Integer caching in java java caches the -128 to 128 values to improves performance rather than creating a new one
//final class Integer extends Number implements Comparable<Integer>{ // internal implementation
//    private final int value;
//    public Integer(int x){
//        this.value=x;
//    }
//}

//interface xyz{
//    calculate_age();
//    cal_name();
//    cal_salary();
//}
public class NullEx {
    public static void main(String args[]){
    //autoboxing
        Integer wrapper=25;
        int exposed_wrapper=wrapper;// unboxing
        System.out.print(wrapper);
        System.out.println(exposed_wrapper);
        int xyz=46;
        Integer pqr=xyz;//autoboxing

        System.out.println(pqr);
        try{
            // null pointer exception assigning null Integer to primitive int
            Integer x=null;
            int y=x;
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        try{
            Integer m=120;
            Integer p=120;
            System.out.print(m==p);
            // false becays thwy dont hold the same reference they are objects and there reference is being compare they both have different location in heap

            System.out.print(m.equals(p));
            // use this insted it is  being overrident for wrapper class and only compares values not the reference

        } catch (Exception e) {
            System.out.println(e);
        }


        try{
            Integer temp1=100;
            Integer temp2=100;
            System.out.println(temp1.intValue()==temp2.intValue()); // now true
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
