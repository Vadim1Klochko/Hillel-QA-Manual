import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Configuration.baseUrl;

public class BaseTest {


    @BeforeSuite
    public void setup() {
        Configuration.browser = "chrome";
        baseUrl = "https://qauto2.forstudy.space";
    }
}
