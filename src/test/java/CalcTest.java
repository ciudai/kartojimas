import org.junit.jupiter.api.Test;
import pageobjects.MainPage;

public class CalcTest extends BaseTest{
    MainPage mainPage;

    public  CalcTest() {
    }

    @Test
    void canCalcSum() {
        this.mainPage = new MainPage(this.driver);

    }
}
