package second.第二题;

public class main {
    public static void main(String[] args) {
      Vehicle vehicle = new Vehicle(4,5000);
      Car car = new Car(4,5000,6);
      Truck truck = new Truck(4,5000,3,3000);
      vehicle.logData();
      car.logData();
      truck.logData();
    }
}

class Vehicle {
    int wheels;
    int weight;
   Vehicle(int inWheels,int inWeight){
      wheels=inWheels;
      weight=inWeight;
   }
   public void logData(){
       System.out.printf("轮子有%d个 重量为%dkg\n",wheels,weight);
   }
}

class Car extends Vehicle {
    int loader;

    Car(int inWheels, int inWeight,int inLoader) {
        super(inWheels, inWeight);
        loader=inLoader;
        if (loader>5){
            System.out.println("此小车超载");
        }
    }

    @Override
    public void logData() {
        super.logData();
        System.out.printf("此时载人数为%d\n",loader);
    }


}

class Truck extends Vehicle {
    int loader;
    int payload;

    Truck(int inWheels, int inWeight,int inLoader,int inPayload) {
        super(inWheels, inWeight);
        loader=inLoader;
        payload=inPayload;
        if (loader>3||payload>5000){
            System.out.println("此卡车超载");
        }
    }

    @Override
    public void logData() {
        super.logData();
        System.out.printf("此时载重为%dkg，此时载人数为%d\n",payload,loader);
    }
}
