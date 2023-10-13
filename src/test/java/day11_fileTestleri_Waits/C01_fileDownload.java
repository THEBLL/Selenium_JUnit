package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utulities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C01_fileDownload extends TestBase {

    @Test
    public void indirmeTesti(){

        //    C:\Users\bilal\OneDrive\Desktop/logo.jpeg
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //3. logo.jpg dosyasını indirelim
        bekle(1);
        driver.findElement(By.xpath("//a[text()='logo.jpg']")).click();
        bekle(5);
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
        // C:\Users\bilal\OneDrive\Desktop
        String dosyaYolu = "C:\\Users\\bilal/Desktop/logo.jpg";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        Assert.assertTrue(Files.exists(Paths.get("")));



    }
}
