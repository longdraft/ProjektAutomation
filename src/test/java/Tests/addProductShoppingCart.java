package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addProductShoppingCart {

    public WebDriver driver;

    @Test

    public void testmethod() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement searchBox=driver.findElement(By.id("small-searchterms"));
       searchBox.click();
       String searchText="Apple";
       searchBox.sendKeys(searchText);

       WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
       searchButton.click();

       WebElement addToCartButton = driver.findElement(By.cssSelector("button[class='button-2 product-box-add-to-cart-button']"));
       addToCartButton.click();



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)","");

       JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("document.body.style.zoom = '0.5'");

       //WebElement confirmAddToCart=driver.findElement(By.id("add-to-cart-button-4"));
       //confirmAddToCart.click();








    }

}
