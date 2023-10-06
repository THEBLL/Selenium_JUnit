package day05_JUnitFramework;


import org.junit.Ignore;
import org.junit.Test;

public class C02_TestNotasyonu {

    /*
     @Test notasyonu siradan method'lari
     bagimsiz olarak calistirabilmemize imkan tanir

     boylece main method bagimliligi ortadan kalkar
     ve biz istedigimiz testi tek basina
     veya class level'dan toplu olarak calistirabiliriz

     ayrica ilerde gorecegimiz sekilde
     test methodlari'larini belirli gruplara dahil edip
     toplu olarak da calistirabiliriz

     @Test notasyonuna sahip methodlar
     toplu olarak calistirildiginda
     hangi sira ile calisacagina dair bir kural yoktur
     JUnit bu konuda bir yontem gelistirememistir
     calisma sirasi ongurulemez ve kontrol edilemez

     Eger bir test method'u @Ignore olarak isaretlenirse
     Selenium o method'u ignore eder
     calistirmaz

     JUnit bize calisan testlerden
     kacinin PASSED, kacinin FAILED oldugunu verir
     ancak JUnit testlerin gecip gecmedigene
     kodlarda bir sorun yasanip yasanmamasina baglar

     kodlar sorunsuz calisirsa, Test PASSED
     bir exception olustursa, Test FAILED
     olarak kaydedilir
     */

    @Test
    public void amazonTest(){
        System.out.println("amazon Test calisti");
    }
    @Test  @Ignore
    public void youtubeTest(){
        System.out.println("youtube Test calisti");

    }
    @Test
    public void wiseTest(){
        System.out.println("wise Test calisti");

    }
    @Test
    public void test04()  {
        // verilen iki sayidan, sayi1'in daha buyuk oldugunu test edin
        int sayi1 = 10;
        int sayi2 = 50;

        if (sayi1 > sayi2){
            System.out.println("Karsilastirma testi PASSED");
        }else {
            System.out.println("Karsilastirma testi FAILED");
            throw new IllegalArgumentException();
        }
    }
}
