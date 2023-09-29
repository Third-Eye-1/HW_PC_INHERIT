
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        String [] videoCardArr = {"Nvidia", "AMD", "Intel", "MSI"};

        double totalPrice = 0;
        double totalWeight = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 20: ");
        int userNumber = sc.nextInt();
        
        ArrayList<Device> devices = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < userNumber; i++) {
            int type = rand.nextInt(3);

            if(type==0){
                int selectVideoCard = rand.nextInt(videoCardArr.length);
                Laptop l1 = new Laptop(rand.nextInt(1000) + 1, rand.nextInt(10) + 1, "Laptop", rand.nextInt(16) + 1, videoCardArr[selectVideoCard]);
                devices.add(l1);
            }
            else if(type==1){
                Smartphone s1 = new Smartphone(rand.nextInt(500) + 1, rand.nextInt(5) + 1, "Smartphone", rand.nextInt(108) + 1, rand.nextBoolean());
                devices.add(s1);
            }
            else{
                Tablet t1 = new Tablet(rand.nextInt(700) + 1, rand.nextInt(7) + 1, "Tablet", rand.nextBoolean(), rand.nextInt(90) + 1);
                devices.add(t1);
            }
        }

        

        for ( Device device : devices){
            System.out.println(device);
            totalPrice += device.getPrice();
            totalWeight += device.getWeight();
        }


        System.out.println("The number of distinct device types created : " + devices.size());
        System.out.println("The total price of all devices: " + totalPrice + "$");
        System.out.println("The total weight of all devices: " + totalWeight);
    }
}
