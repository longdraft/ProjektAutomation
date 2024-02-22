package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CustomerLogin {

    public WebDriver driver;

    @Test

    public void testmethod() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        login.click();

        WebElement email=driver.findElement(By.id("Email"));
        String emailValue="mariuspetruta@yahoo.com";
        email.sendKeys(emailValue);



        WebElement password=driver.findElement(By.id("Password"));
        String passwordValue="abcd1234";
        password.sendKeys(passwordValue);

        WebElement loginButton=driver.findElement(By.cssSelector("button[class='button-1 login-button']"));
        loginButton.click();

        






    }

}
