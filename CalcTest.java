import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.MainPage;

public class CalcTest extends BaseTest{
    MainPage mainPage;

    public  CalcTest() {
    }

    @Test
    void canCalcSum() {

        //kiekvienam page reikia irasyti
        mainPage = new MainPage(driver);

        mainPage.typeFirstNumber("3");
        mainPage.typeSecondNumber("2");
        mainPage.selectFunction("minus");
        mainPage.clickCalculate();

        String expectedResult = "1";
        String actualResult = mainPage.getResult();

        Assertions.assertEquals(expectedResult, actualResult);

        System.out.println(actualResult);
    }
}
