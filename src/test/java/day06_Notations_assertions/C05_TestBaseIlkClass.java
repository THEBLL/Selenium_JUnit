package day06_Notations_assertions;

import org.junit.Test;
import utulities.TestBase;

public class C05_TestBaseIlkClass extends TestBase {

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        bekle(3);
    }
}
