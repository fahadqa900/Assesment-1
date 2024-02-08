package com.metlife.testsuites;

import com.metlife.utility.WebdriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static com.metlife.pageobjects.Locators_First_Assesment.*;


public  class Test_1_First_Assesment extends WebdriverUtils
    {
        public static WebDriverWait w1;

        public void  SearchParticipantName(String Name) throws InterruptedException
        {
            WebdriverUtils.click(hamburgerMenu);
            scroll(ListOfItems);
            WebdriverUtils.click(ListOfItems);
            w1 = new WebDriverWait(WebdriverUtils.driver, Duration.ofSeconds(30));
            w1.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
            WebdriverUtils.type(searchBar, Name);
            List<WebElement> l1 = WebdriverUtils.driver.findElement(By.xpath("//table[@id='footable_350']")).findElements(By.tagName("tr"));
            System.out.println(l1.size());
            for (int i = 1; i <= l1.size(); i++)
            {
                Thread.sleep(4000);
                System.out.println(WebdriverUtils.driver.findElement(By.xpath("//*[@id='footable_350']/tbody/tr[" + i + "]/td[2]")).getText());
            }
        }
        public void  SearchParticipantDesignation(String Desig) throws InterruptedException
        {
            WebdriverUtils.click(hamburgerMenu);
            scroll(ListOfItems);
            WebdriverUtils.click(ListOfItems);
            WebdriverUtils.type(searchBar,Desig);
            List<WebElement> l2 = WebdriverUtils.driver.findElement(By.xpath("//table[@id='footable_350']")).findElements(By.tagName("tr"));
            System.out.println(l2.size());
            for (int i = 1; i <= l2.size(); i++)
            {
                Thread.sleep(4000);
                System.out.println(WebdriverUtils.driver.findElement(By.xpath("//*[@id='footable_350']/tbody/tr[" + i + "]/td[3]")).getText());
            }
        }
}