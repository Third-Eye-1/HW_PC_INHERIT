
public class Smartphone extends Device{
    int camera;
    boolean fingerPrint;

    public Smartphone(double price, double weight, String type, int camera, boolean fingerPrint){
        super(price, weight, type);
        this.camera = camera;
        this.fingerPrint = fingerPrint;
    }
    
    public String toShow(){
        return "price: " + price + ", " + System.lineSeparator() + "weight: " + weight + ", " + System.lineSeparator() + "type: " + type + System.lineSeparator() + "camera resolution: " + camera + "mpx" + System.lineSeparator() + "finger print: " + fingerPrint;
    }

    public String toString(){
        return "Type: " + super.getType() + " / " + "Price: " + super.getPrice() + "$ " + " / " + "Weight: " + super.getWeight() + " / " + "Camera mpx: " + this.camera + " / " + "FingerPrint: " + this.fingerPrint;
    }
}
