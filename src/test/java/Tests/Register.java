package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.DayOfWeek;

public class Register {

    public WebDriver driver;

    @Test

    public void testmethod(){
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();



        WebElement register = driver.findElement(By.cssSelector("a[class='ico-register']"));
        register.click();

        WebElement gender = driver.findElement(By.id("gender-male"));
        gender.click();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        String firstNameValue = "Pop";
        firstName.sendKeys(firstNameValue);

        WebElement  lastName = driver.findElement(By.id("LastName"));
        String lastNameValue = "Cornel";
        lastName.sendKeys(lastNameValue);

        WebElement dateOfBirthDay = driver.findElement(By.cssSelector("select[name='DateOfBirthDay']"));
        Select DayOfWeek = new Select(dateOfBirthDay);
        DayOfWeek.selectByValue("9");

        WebElement dateOfBirthMonth = driver.findElement(By.cssSelector("select[name='DateOfBirthMonth']"));
        Select month = new Select(dateOfBirthMonth);
        month.selectByVisibleText("June");

        WebElement yearOfBirthDay = driver.findElement(By.cssSelector("select[name='DateOfBirthYear']"));
        Select year = new Select(yearOfBirthDay);
        year.selectByValue("1983");

        WebElement email=driver.findElement(By.id("Email"));
        String emailValue="mariuspetruta@yahoo.com";
        email.sendKeys(emailValue);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)","");

        WebElement companyName= driver.findElement(By.id("Company"));
        String companyNameValue="Delta Consult";
        companyName.sendKeys(companyNameValue);

        WebElement newsletter = driver.findElement(By.id("Newsletter"));
        newsletter.click();

        WebElement password=driver.findElement(By.id("Password"));
        String passwordValue="abcd1234";
        password.sendKeys(passwordValue);

        WebElement confirmPassword=driver.findElement(By.id("ConfirmPassword"));
        String confirmPasswordValue="abcd1234";
        confirmPassword.sendKeys(passwordValue);

        WebElement registerButton=driver.findElement(By.id("register-button"));
        registerButton.click();

















    }






}
