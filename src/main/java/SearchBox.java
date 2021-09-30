import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{
    By searchBoxLocator = By.name("k");
    By submitButtonLocator = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        click(submitButtonLocator);
    }


}
