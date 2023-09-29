
public class Laptop extends Device{
    int ram;
    String videoCard;

    public Laptop(double price, double weight, String type, int ram, String videoCard){
        super(price, weight, type);
        this.ram = ram;
        this.videoCard = videoCard;
    }

    public String toShow(){
        return "price: " + price + ", " + System.lineSeparator() + "weight: " + weight + ", " + System.lineSeparator() + "type: " + type + ", " + System.lineSeparator() + "RAM: " + ram + ", " + System.lineSeparator() + "videoCard: " + videoCard;
    }


    public String toString(){
        return "Type: " + super.getType() + " / " + "Price: " + super.getPrice() + "$ " + " / " + "Weight: " + super.getWeight() + " / " + "RAM: " + this.ram + " / " + "VideoCard: " + this.videoCard;
    }
}
