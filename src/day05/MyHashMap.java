package day05;

import java.util.Objects;

class Node{
    String key; //anahtar, like name etc
    String value;   //değer, like engineer or smt
    Node next; //iterator

    public Node(String key, String value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}


public class MyHashMap {
    //java default olarak 16'dan başlar biz de öyle başlayaım
    //Bucket Array
    private Node[] buckets = new Node[16];  //neden burada private????

    //Hash fonksiyonu
    private int getBucketIndex(String key){
        int hashCode = key.hashCode()
    }


}
