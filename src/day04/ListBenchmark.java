package day04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListBenchmark {

    //Test edilecek veri boyutu (2 milyon eleman)
    static final int ELEMAN_SAYISI = 2_000_000; //ELEMAN_SAYISI kod boyunca değişmeyecek bu yüzden constant yaptık
    //final diyerek bu değişkenin yalnızca bir kez atanabileceğini gösterdik.

    public static void main(String[] args){
        System.out.println("Benchmark Testi");
        System.out.println("Test edilen eleman sayısı: " + ELEMAN_SAYISI);

        //1. Adım - Yapıları Oluşturacağız

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        //Sona ekleme append

        System.out.println("\nTEST 1 - Sona ekleme (Add to end)");

        long start = System.nanoTime();

        for(int i = 0; i < ELEMAN_SAYISI; i++){
            arrayList.add(i);
        }

        long end = System.nanoTime();

        System.out.println("ArrayList Süre: " + (end - start) / 1_000_000 + " ms");

        //linked list için

        start = System.nanoTime();
        for(int i = 0; i < ELEMAN_SAYISI; i++){
            linkedList.add(i);
        }

        end = System.nanoTime();

        System.out.println("LinkedList Süre: " + (end - start) / 1_000_000 + " ms");



        //TEST 2 - Ortadan Okuma (Random Access - Get)
        System.out.println("TEST 2 - Ortadan Eleman Okuma (Random Access - Get)");
        int middleIndex = ELEMAN_SAYISI / 2;
        start = System.nanoTime();
        int val1 = arrayList.get(middleIndex);
        end = System.nanoTime();
        System.out.println("ArrayList Süre: " + (end - start) + " ns");


        start = System.nanoTime();
        int val2 = linkedList.get(middleIndex);
        end = System.nanoTime();
        System.out.println("LinkedList Süre: " + (end - start) + " ns");



        //TEST 3 Başa Ekleme (Insert at index 0)

        System.out.println("TEST 3 - Başa Ekleme (Insert at index 0)");
        start = System.nanoTime();
        arrayList.add(0,999);
        end = System.nanoTime();
        System.out.println("ArrayList Süre: " + (end - start) + " ns");


        start = System.nanoTime();
        linkedList.add(0,999);
        end = System.nanoTime();
        System.out.println("LinkedList Süre: " + (end - start) + " ns");


        System.out.println("\n--------------------------------------------------");
        System.out.println("SONUÇ ANALİZİ:");
        System.out.println("1. ArrayList okumada (Get) roket gibidir.");
        System.out.println("2. LinkedList okumada (Get) kağnı gibidir (tek tek sayar).");
        System.out.println("3. Araya/Başa eklemede LinkedList çok hızlıdır.");
        System.out.println("4. ArrayList başa eklerken tüm diziyi kaydırmak zorunda kalır (Hamallık).");


    }
}
