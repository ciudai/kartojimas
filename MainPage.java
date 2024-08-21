package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends BasePage{

    @FindBy(css = "#number1")
    private WebElement inputFirstNumber;

    @FindBy(css = "#number2")
    private WebElement inputSecondNumber;

    @FindBy(css = "#function")
    private WebElement selectFunction;

    @FindBy(css = "#calculate")
    private WebElement buttonCalculate;

    @FindBy(css = "#answer")
    private WebElement result;

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void typeFirstNumber(String firstNumber) {
        inputFirstNumber.sendKeys(firstNumber);
    }
    public void typeSecondNumber(String secondNumber) {
        inputSecondNumber.sendKeys(secondNumber);
    }
    public void selectFunction(String functionName) {
        Select functionDropdown = new Select(selectFunction);
        functionDropdown.selectByVisibleText(functionName);
    }
    public void clickCalculate() {
        buttonCalculate.click();
    }

    public String getResult() {
        return result.getText();
        
    }
}
