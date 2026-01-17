package day03;

public class MissionControl {
    public static void main(String[] args){

        System.out.println("Filo Oluşturuluyor...");

        //polimorphism (çok biçimlilik), burada araba ya da drone değil
        //autopilot'a yani sözleşmeye (interface) sahip her şey girebilir

        Autopilot[] filo = new Autopilot[3];

        filo[0] = new Drone("DJI Air 3");
        filo[1] = new KamikazeDrone("Bayraktar TB2");
        filo[2] = new AutonomusCar("TOGG T10X");

        System.out.println("Tüm filo hangar'a dönme emri aldı");



        /*arac.parkEt() yapılır mı? HAYIR
        * Autopilot diyor, bu drone'u da içine alan sözleşme.
        * Autopilot'ta ne varsa onlar desteklenir, sadece returnToHome var.
        * Instanceof (sen aslında kimsin) kontrolü yapılmalı
        * */

        for(Autopilot arac : filo){
            arac.returnToHome();

            if(arac instanceof AutonomusCar){
                System.out.println("Algılandı, bu bir araba.");
                AutonomusCar araba = (AutonomusCar) arac;
                araba.parking();
            }

            else if(arac instanceof KamikazeDrone){
                System.out.println("Algılandı, bu bir Kamikaze Drone'u.");
                KamikazeDrone kamiDrone = (KamikazeDrone) arac;
                kamiDrone.armWeapon();
            }

            System.out.println("------------------------");


        }

    }


}