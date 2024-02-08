package com.metlife.testsuites;

import com.metlife.pageobjects.Locators_Second_Assesment;
import com.metlife.utility.ExcelUtils_Second_Assesment;
import com.metlife.utility.WebdriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.List;

public class Test_2_Second_Assesment extends WebdriverUtils
{
@Test(dataProviderClass = ExcelUtils_Second_Assesment.class, dataProvider = "RetreiveData")
public void listOfCandidates(String Test, String City, String Year, String candidates, String Expected) throws InterruptedException
{
SoftAssert softAssert = new SoftAssert();
WebdriverUtils.click(Locators_Second_Assesment.about1);
WebdriverUtils.scroll1(driver.findElement(Locators_Second_Assesment.ListOfCandidates1));
List<WebElement> l1 = driver.findElements(Locators_Second_Assesment.lst);
System.out.println(l1.size());
for (int i = 1; i <= l1.size(); i++)
{
WebElement cityExpected = driver.findElement(By.xpath("//*[@id=\"footable_483\"]/tbody/tr[" + i + "]/td[1]"));
WebElement yearExpected = driver.findElement(By.xpath("//*[@id=\"footable_483\"]/tbody/tr[" + i + "]/td[2]"));
WebElement noCandidatesExpected = driver.findElement(By.xpath("//*[@id=\"footable_483\"]/tbody/tr[" + i + "]/td[3]"));
softAssert.assertEquals(City, cityExpected, "matched");
softAssert.assertEquals(Year, yearExpected, "matched");
softAssert.assertEquals(candidates, noCandidatesExpected, "matched");
System.out.println(cityExpected.getText()+"\t"+yearExpected.getText()+"\t"+noCandidatesExpected.getText());
}
}
}