import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//paveldi visi testai
public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/calculator");
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
