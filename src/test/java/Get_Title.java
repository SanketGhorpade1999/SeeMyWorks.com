import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Get_Title extends SetUp{

    @Test
    public void getTitle() {
        driver.get("https://project1052.seemyworks.com/login.php");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("login"));
    }
}

