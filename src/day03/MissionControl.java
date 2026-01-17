package day03;

public class MissionControl {
    public static void main(String[] args){
        Drone dji = new Drone("DJI Mavic 3");
        dji.takeOff();
        System.out.println("Pil durumu: " + dji.getBatteryLevel());
        dji.land();

        System.out.println("---------");

        KamikazeDrone bayraktar = new KamikazeDrone("Bayraktar TB2");
        bayraktar.takeOff();
        bayraktar.move(5,10);
        bayraktar.armWeapon();
        bayraktar.land();

        System.out.println("Otopilot Testi");
        dji.takeOff();
        dji.move(20,50);
        dji.returnToHome();


    }
}
