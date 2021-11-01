public class Laptop {
    public void Features(){
        System.out.println("RAM: 8GB");
        System.out.println("Storage: 512GB SSD");
        System.out.println("Graphic Card: 4GB");
        System.out.println("Generation: 9th");
        System.out.println("Intel: i5");
        System.out.println("Screen Length: 16'5inches");
    }
    public void Payment(){
        System.out.println("Cost Of: " +500000);
        System.out.println("Warranty: " +2+"years");
    }
    public static void main(String[] args){
        MSI MLaptop = new MSI();
        MLaptop.Brand();
        MLaptop.Features();
        System.out.println("********************************* Second *******************************");
        ASUS ALaptop = new ASUS();
        ALaptop.Brand();
        ALaptop.Features();
    }
}

class MSI extends Laptop{
    public void Brand(){
        System.out.println("Company: MSI");
    }
}
class ASUS extends Laptop{
    public void Brand(){
        System.out.println("Company: ASUS");
    }
}


