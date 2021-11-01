public class Vehicle {
    public void Car(){
        System.out.println("It is a Diesel Car.");
        System.out.println("It contain Four Seats.");
    }
}
class TataCar extends Vehicle{
    public void Car(int a){
        System.out.println("White Color Car.");
        System.out.println("Maximum Speed is: "+a+"Km/h");
    }
    public void min(){
        super.Car();
        System.out.println("Minimum Speed is: "+10+"Km/h");
    }
    public static void main(String[] args){
        TataCar car = new TataCar();
        int a = 120;
        int mi = 10;
        car.Car();
        car.Car(a);
        car.min();


    }
}


