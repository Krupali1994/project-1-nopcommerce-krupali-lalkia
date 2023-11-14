package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/";

        // 1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Open URL
        driver.get(baseUrl);

        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // 4. Print the current url
        System.out.println("The Current Url: " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println(driver.getPageSource());

        // 6. Navigate to Url
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);

        //7. Print the current url
        System.out.println(" Get Current Url " + driver.getCurrentUrl());

        // 8. Navigate back to the home page
        driver.navigate().back();

        // 9. Navigate to the login page
        driver.navigate().forward();

        // 10. Print the current url
        System.out.println(" Get Current Url " + driver.getCurrentUrl());

        // 11. Refresh the page
        driver.navigate().refresh();

        // 12. Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("krupali@gmail.com");

        // 13. Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("k12345");

        // 14. Click on Login Button
        driver.findElement(By.linkText("Log in")).click();

        // 15. Close the browser
        driver.quit();

    }
}
