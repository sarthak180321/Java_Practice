// you can take multplile data types any you want for inherired class and child clsas 
//lets see bow it behaves int multilevel inheritence
class Storage<T> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
class AuditStorage<T1, T> extends Storage<T> {
    private T1 trackingId;
    public void setTrackingId(T1 trackingId) {
        this.trackingId = trackingId;
    }
    public T1 getTrackingId() {
        return this.trackingId;
    }
}
public class Main {
    public static void main(String args[]) {
        AuditStorage<String, Integer> Obj = new AuditStorage<>();
        Obj.setTrackingId("TXN-101");
        Obj.setItem(1);
        System.out.println("Item: " + Obj.getItem());
        System.out.println("Tracking ID: " + Obj.getTrackingId());
    }
}
