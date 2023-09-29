
public class Device {
    protected double price;
    protected double weight;
    protected String type;

    public Device(){}

    public Device(double price, double weight, String type){
        this.price = price;
        this.weight = weight;
        this.type = type;
    }

    public String toShow(){
        return "price: " + price + ", " + System.lineSeparator() + "weight: " + weight + ", " + System.lineSeparator() + "type: " + type; 
    }
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}
