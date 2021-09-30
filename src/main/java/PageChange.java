import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageChange extends BasePage {

    By secondPageLocator = By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div/div[2]/div/div[3]/div[4]/nav/ul/li[3]/a");

    public PageChange(WebDriver driver) {
        super(driver);
    }

    public void changePage() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(secondPageLocator));
        click(secondPageLocator);
    }
}
