import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    SearchBox searchBox ;

    By cartContainerLocator = By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/a");
    By acceptCookiesLocator = By.xpath("//*[@id=\"__next\"]/main/div[2]/section[1]/section[2]/a");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }


    public void goToCart() {
        click(cartContainerLocator);
    }



    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
