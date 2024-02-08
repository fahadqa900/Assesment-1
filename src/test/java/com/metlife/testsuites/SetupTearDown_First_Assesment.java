package com.metlife.testsuites;

import com.metlife.utility.WebdriverUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SetupTearDown_First_Assesment extends WebdriverUtils
{
    public void LaunchBrowser()
    {
        WebdriverUtils.initializeBrowser("Chrome");
    }
    @BeforeMethod
    public void LaunchPage()
    {
     WebdriverUtils.launchWebBrowser("https://mockexam1cpsat.agiletestingalliance.org/");
    }
    @AfterClass
    public void TearDown()
    {
        driver.quit();
    }
    @Test(priority=-1)
    public void getName() throws InterruptedException
    {
        Test_1_First_Assesment t2 = new Test_1_First_Assesment();
        t2.SearchParticipantName("ch");
    }
    @Test(priority = 0)
    public void getDesignation() throws InterruptedException
    {
        Test_1_First_Assesment t1 = new Test_1_First_Assesment();
        t1.SearchParticipantDesignation("ch");
    }
}
