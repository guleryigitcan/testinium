import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Real extends BaseTest {
    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;
    PageChange pageChange;

    @Test
    @Order(1)
    public void login()  {
        driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");
        driver.findElement(By.id("L-UserNameField")).sendKeys(/* Your email*/);
        driver.findElement(By.id("L-PasswordField")).sendKeys(/* Your password*/);
        driver.findElement(By.xpath("//*[@id=\"gg-login-enter\"]")).click();


    }
    @Test
    @Order(2)
    public void search_a_product()  {
        driver.get("https://www.gittigidiyor.com");
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("bilgisayar");
    }
    @Test
    @Order(3)
    public void changePage(){
        pageChange=new PageChange(driver);
        pageChange.changePage();
    }

    @Test
    @Order(4)
    public void select_a_product() throws InterruptedException {

        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct();

    }

    @Test
    @Order(5)
    public void add_product_to_cart(){
        productDetailPage.addToCart();

    }

    @Test
    @Order(6)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();

    }
}
