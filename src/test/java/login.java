import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class login extends SetUp{
    @Test
    public void Login() throws IOException, InterruptedException {
        driver.get("https://project1052.seemyworks.com/login.php");
        wait = new WebDriverWait(driver, 10);

        driver.findElement(By.xpath("//input[@placeholder='enter email']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='enter password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        sleep(5000);
    }
}
