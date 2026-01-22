package day06;


//Türden bağımsız çalışan metot ya da sınıflardır
/*yani, int ya da String demiyoruz, <E> diyoruz mesela. Kullanırken int dersen tüm E'ler yerine int, str dersen str geçer*/
public class GenericClasslar {

    public static void main(String[] args){


        Character[] char_dizi = {'J', 'A', 'V', 'A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] strings_dizi = {"java", "python", "c++", "php"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"), new Ogrenci("Mehmet"), new Ogrenci("Merve")};


    }

}
