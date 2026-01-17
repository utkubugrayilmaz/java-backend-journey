package day03;

public class AutonomusCar implements Autopilot{

    private String brand;

    public AutonomusCar(String brand){
        this.brand = brand;
    }

    public void parking(){
        System.out.println(brand + " iki araç arasına park ediyor...");
    }

    @Override
    public void returnToHome(){
        System.out.println(brand + " kara yolunu takip ederek eve dönüyor...");
        parking();
    }
}
