interface anonymous_interface {
    public void show();
}
public class Anonymous_class {
    public static void main(String[] args) {
        anonymous_interface i1 = new anonymous_interface() {
            @Override
            public void show() {
                System.out.println("this is my anonymous class");
            }
        };
        i1.show();
    }
}