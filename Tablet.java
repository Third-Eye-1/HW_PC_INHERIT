
public class Tablet extends Device{
    boolean toCall;
    int camera;

    public Tablet(double price, double weight, String type, boolean toCall, int camera){
        super(price, weight, type);
        this.toCall = toCall;
        this.camera = camera;
    }

    public String toShow(){
        return "price: " + price + ", " + System.lineSeparator() + "weight: " + weight + ", " + System.lineSeparator() + "type: " + type + "," + System.lineSeparator() + "Able to call: " + toCall + ", " + System.lineSeparator() + "camera resolution: " + camera + "mpx";
    }

    public String toString(){
        return "Type: " + super.getType() + " / " + "Price: " + super.getPrice() + "$ " + " / " + "Weight: " + super.getWeight() + " / " + "Camera mpx: " + this.camera + " / " + "To call: " + this.toCall;
    }
}
