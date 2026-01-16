package day01;

import java.util.Scanner;

public class AtmProject { //Class'ımızı oluşturduk

    static double bakiye = 1000.0; //bakiyemizi static oluşturduk
    static Scanner scanner = new Scanner(System.in); //input alabilmek için Scanner nesnesi oluşturduk

    public static void main(String[] args) {
        System.out.println("Welcome to BugraBank");

        boolean dongu = true;

        while (dongu) {
            System.out.println("\nLütfen işleminizi seçiniz:");
            System.out.println("1- Bakiye Sorgulama");
            System.out.println("2- Para Yatır");
            System.out.println("3- Para Çek");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz: ");

            if (scanner.hasNextInt()) { //Hata önleme - girilen şey bir sayı mı
                int secim = scanner.nextInt();


                if (secim == 1) {
                    bakiyeSorgula();
                } else if (secim == 2) {
                    paraYatir();
                } else if (secim == 3) {
                    paraCek();
                } else if (secim == 4) {
                    System.out.println("Sistemden çıkış yapılıyor...");
                    dongu = false;
                } else {
                    System.out.println("Lütfen geçerli bir seçenek seçiniz:");
                }


            } else {
                System.out.println("Lütfen sadece sayı giriniz!");
                scanner.next();
            }

        }
        scanner.close();
    }


    public static void bakiyeSorgula() {
        System.out.println("Bakiyeniz: " + bakiye + "TL");
    }

    public static void paraYatir() {
        System.out.println("Yatırılacak tutarı giriniz:");

        if (scanner.hasNextDouble()) { //girilen şey double mı diye kontroo
            double miktar = scanner.nextDouble();

            if (miktar > 0) {
                bakiye = bakiye + miktar;
                System.out.println("İşlem Başarılı! \n Güncel Bakiye: " + bakiye + "TL");
            } else {
                System.out.println("Geçersiz miktar! Pozitif sayılar girin!");
            }
        } else {
            System.out.println("Lütfen sadece sayısal bir değer girin!");
            scanner.next();
        }
    }


    public static void paraCek() {
        System.out.println("Lütfen çekilecek miktarı giriniz:");

        if (scanner.hasNextDouble()) {
            double miktar = scanner.nextDouble();

            if (miktar > bakiye) {
                System.out.println("Yetersiz bakiye! \n Güncel bakiye: " + "TL");
            } else if (miktar <= 0) {
                System.out.println("Geçersiz miktar!");
            } else {
                bakiye -= miktar;
                System.out.println("Paranızı alınız... \n Güncel bakiye " + bakiye + "TL");
            }
        }

        else{
            System.out.println("Lütfen geçerli sayılar girin!");
            scanner.next();
        }
    }

}