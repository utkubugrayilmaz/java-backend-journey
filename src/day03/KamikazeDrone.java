package day03;


public class KamikazeDrone extends Drone{
    //Attiributes private oluşturuldu
    private boolean isArmed;
    //Constructer Super ile getirildi
    public KamikazeDrone(String model){
        super(model);
        this.isArmed = false;
    }

    public void armWeapon(){
        isArmed = true;
        System.out.println(getModel() + " Silahlar Aktif. Hedefe Kitlenildi");
    }

    @Override
    public void takeOff(){
        System.out.println("Kamikaze saldırı modu için hazırlık yapılıyor...");
        super.takeOff();
    }
}
