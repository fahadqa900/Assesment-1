package com.metlife.testsuites;

import com.metlife.pageobjects.Locators_Second_Assesment;
import com.metlife.utility.WebdriverUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SetupTearDown_Second_Assesment extends WebdriverUtils
{
    @BeforeClass
    public void LaunchBrowser()
    {
     WebdriverUtils.initializeBrowser("Chrome");
    }
    @BeforeMethod
    public void LaunchPage()
    {
    WebdriverUtils.launchWebBrowser(" https://mockexam2cpsat.agiletestingalliance.org/ ");
    }
    @AfterClass
    public void TearDown()
    {
    driver.quit();
    }
    @Test
    public void listOfCandidates() throws InterruptedException
    {
    WebdriverUtils.click(Locators_Second_Assesment.about1);
    WebdriverUtils.scroll1(driver.findElement(Locators_Second_Assesment.ListOfCandidates1));
    }
}
