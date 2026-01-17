package day02;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args){
        int[] sayilar = {2,8,1,15};
        int hedef = 9;

        System.out.println("Dizi " + Arrays.toString(sayilar));
        System.out.println("Hedef Sayı: " + hedef);
        System.out.println("-------------");

        int[] sonuc = cozumuBul(sayilar, hedef);
        System.out.println("Sonuç: " + Arrays.toString(sonuc));
    }

    public static int[] cozumuBul(int[] nums, int target){
       for(int i = 0; i < nums.length; i++){ //İlk sayıya bakıyoruz
           for(int j = i + 1; j < nums.length; j++){ //Kıyas için hep i'nin bir önündekine bakıyoruz
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
           }
       }
       return new int[]{};
    }
}
