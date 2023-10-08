package day08_dropdownMenu_iframe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utulities.TestBase_BeforeClass;

import java.util.List;

public class C02_dropdownMenu extends TestBase_BeforeClass {

    WebElement kategoriDropDownElementi;
    Select select;
    @Before
    public void amazonaGidis(){
        // ● https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");
        kategoriDropDownElementi = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        select = new Select(kategoriDropDownElementi);
    }
    @Test
    public void dropdownTesti(){

        //- Test 1
        //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
        //oldugunu test edin

        // tüm opsiyonlari istedigi icin list olusturuyorum
        List<WebElement> optionsList = select.getOptions();

        int expectedKategoriSayisi = 45;
        int actualKategoriSayisi = optionsList.size();

        Assert.assertEquals("Kategori dropdown menüsün'de 45 opsiyon yok",expectedKategoriSayisi,actualKategoriSayisi);

    }

    @Test
    public void javaAramaTest(){
        //-Test 2
        //1. Kategori menusunden Books secenegini secin
        select.selectByVisibleText("Books");
        //2. Arama kutusuna Java yazin ve aratin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Java" + Keys.ENTER);
        //3. Bulunan sonuc sayisini yazdirin
        WebElement aramaSonucElementi = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(aramaSonucElementi.getText());
        //4. Sonucun Java kelimesini icerdigini test edin
        String expectedIcerik = "Java";
        String actualSonucYazisi = aramaSonucElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }
}
