package day04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListBenchmark {

    //Test edilecek veri boyutu (2 milyon eleman)
    static final int ELEMAN_SAYISI = 2_000_000;


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




    }
}
