package day09_iframe_cokluWindows;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utulities.TestBase;

import java.util.List;

public class deneme extends TestBase {

    @Test
    public void test01(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String expectedYazi="Opening a new window";
        WebElement yaziElementi = driver.findElement(By.tagName("h3"));
        String actuelElementi = yaziElementi.getText();
        Assert.assertTrue(actuelElementi.contains(expectedYazi));
        System.out.println(actuelElementi);

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        System.out.println(expectedTitle);


    }
}
