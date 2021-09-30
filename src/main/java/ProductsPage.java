import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductsPage extends BasePage {

    By productLocator = By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div/div[2]/div/div[3]/div[3]/ul/li[2]/article/div/a");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public void selectProduct() {
        click(productLocator);
    }
}


