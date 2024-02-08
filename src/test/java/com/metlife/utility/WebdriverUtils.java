package com.metlife.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WebdriverUtils
{
    public static WebDriver driver;

        public static void initializeBrowser(String browser)
        {
            switch (browser)
            {
                case "Firefox":
                    driver = new FirefoxDriver();
                    break;
                case "Edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    driver = new ChromeDriver();
                    break;
            }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    public static void launchWebBrowser(String URL)
    {
     driver.get(URL);
    }
    public static void type(By locator, String value)
    {
     driver.findElement(locator).sendKeys(value);
    }
    public static void click(By locator) throws InterruptedException
    {
     driver.findElement(locator).click();
     Thread.sleep(4000);
    }
    public static void scroll(By locator)
    {
     JavascriptExecutor js = ((JavascriptExecutor) driver);
     js.executeScript("arguments[0].scrollIntoView();",locator);
     //We can also use below for scrolling:
     //js.executeScript("window.scrollBy(0,1200)",locator);
    }
    public static void scroll1(WebElement element)
    {
     JavascriptExecutor js = ((JavascriptExecutor) driver);
     js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}