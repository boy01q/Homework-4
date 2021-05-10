import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class OpanaSariga {


    @Test
    public void test (){
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open("https://www.google.com/");
        $(".gLFyf").setValue("Sey hello...").sendKeys(Keys.ENTER);
        sleep(5000);
    }
}
