package day05;

import java.util.Objects;

class Node{
    String key;
    String value;
    Node next;

    public Node(String key, String value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}


public class MyHashMap{

    //Bucket array kullanıcaz

    private Node[] buckets = new Node[16];

    //gelen anahtarı (key) alır, 0-15 arası sayıya (index) çevirir
    private int getBucketIndex(String key){
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % 16); //abs mutlak değer, %16 modulo
        return index;
    }

    public void put(String key, String value){
        int index = getBucketIndex(key); //hangi odaya gideceğini belirtecek
        Node newNode = new Node(key, value);

        //2. oda boşsa ekle
        if(buckets[index] == null){
            buckets[index] = newNode;
            System.out.println("EKLEME: " + key + "-> Index " + index);
        }
        else{
            Node current = buckets[index];
            while (true){
                if(current.key.equals(key)){
                    current.value = value;
                    System.out.println("GÜNCELLEME " + key + " -> Index " + index);
                    return;
                }
                if(current.next == null){
                    current.next = newNode;
                    System.out.println("ÇAKIŞMA " + key + " -> Index" + index);
                    return;
                }
                current = current.next;
            }
        }
    }

    //Veri Okuma
    public String get(String key){
        int index = getBucketIndex(key);
        Node current = buckets[index];

        while(current != null){
            if(current.key.equals(key)){
                return current.value;
            }
            current = current.next;
        }
        return null;
    }


    public static void main(String[] args){
        MyHashMap map = new MyHashMap();

        // Veri ekleyelim
        map.put("Utku", "AI Engineer");
        map.put("Ahmet", "Backend Dev");
        map.put("Mehmet", "Frontend Dev"); // Belki Utku ile aynı index'e düşer?

        // Aynı Key ile ekleme (Update testi)
        map.put("Utku", "Senior AI Engineer");

        System.out.println("\n--- OKUMA TESTİ ---");
        System.out.println("Utku kimdir? : " + map.get("Utku"));
        System.out.println("Ahmet kimdir?: " + map.get("Ahmet"));
        System.out.println("Veli kimdir? : " + map.get("Veli"));
    }
}


