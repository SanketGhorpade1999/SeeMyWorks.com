import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.UUID;

import static java.lang.Thread.sleep;

public class Register extends SetUp{
    @Test
    public void Register() throws IOException, InterruptedException {
        driver.get("https://project1052.seemyworks.com/login.php");
        wait = new WebDriverWait(driver, 10);

        driver.findElement(By.xpath("//a[normalize-space()='regiser now']")).click();

        String randomEmail = "test" + UUID.randomUUID().toString().substring(0, 8) + "@gmail.com";
        driver.findElement(By.xpath("//input[@placeholder='enter email']")).sendKeys(randomEmail);

       // driver.findElement(By.xpath("//input[@placeholder='enter username']")).sendKeys("testaccountt@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='enter password']")).sendKeys("abc234@3");
        driver.findElement(By.xpath("//input[@placeholder='confirm password']")).sendKeys("abc234@3");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        sleep(5000);
    }
}



