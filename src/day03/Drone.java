package day03;

/*
* Summary
*
* 1-Attiributes (private)
* 2-Constructor
* 3-Metotlar
* 4-Getter Setter
* */
public class Drone implements Autopilot{

    //Attiributes (özellikler) - bunlar private olur (Encapsulation)
    private String model;
    private int batteryLevel;
    private double altitude; //irtifa
    private boolean isFlying;
    private double x;
    private double y;

    //Constructor (Yapıcı metot) pythondaki init fonksiyonuna denk

    public Drone(String model){
        this.model = model;
        this.batteryLevel = 100;
        this.altitude = 0.0;
        this.isFlying = false;
        this.x = 0.0;
        this.y = 0.0;
    }

    public void move(double x, double y){
        if(isFlying){
            this.x += x;
            this.y += y;
            batteryLevel -= 5;
            System.out.println("Drone hareket etti.\nYeni Konum: \nx: " + this.x + "\ny: " + this.y);
        }

        else{
            System.out.println("Drone hareket edemiyor! önce take off olmalı!");
        }
    }

    //Metot'lar yani yetenekler
    public void takeOff(){
        if(!isFlying && batteryLevel > 10){
            isFlying = true;
            altitude = 10.0;
            System.out.println("Drone kalkış yaptı.\nİrtifa: " + altitude + "m");
        }
        else{
            System.out.println("Kalkış başarısız!\nYa şarjı az ya da zaten havada!");
        }
    }

    public void land(){
        if(isFlying){
            isFlying = false;
            altitude = 0.0;
            System.out.println(model + " güvenli bir iniş yaptı...");
        }
    }

    //getter-setter metotları
    //Encapsulation'ın anahtarları. Dışarıdan birisi görebilsin ama SETLEYEMESİN

    public int getBatteryLevel(){
        return batteryLevel;
    }

    public void setBatteryLevel(int newLevel){
        if(newLevel >= 0 && newLevel <= 100) {
            batteryLevel = newLevel;
        }
        else
        {
            System.out.println("Başarısız");
        }
    }

    public String getModel(){
        return model;

    }

    @Override
    public void returnToHome() {
        if(isFlying){
            System.out.println(getModel() + " Otopilot devrede: Başlangıç noktasına dönülüyor...");
            this.x = 0.0;
            this.y = 0.0;
            System.out.println("Üsse varıldı, inişe geçiliyor.");
            land();
        }
        else{
            System.out.println("Zaten yerdeyiz.");
        }
    }
}
