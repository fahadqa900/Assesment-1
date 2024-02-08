package com.metlife.data.assesment2;

import com.metlife.utility.ExcelUtils_Second_Assesment;
import org.testng.annotations.DataProvider;

public class RetreiveData_Assesment2
{
    @DataProvider
    public Object[][]RetreiveData()
    {
    return ExcelUtils_Second_Assesment.readExcel("Assessment_2_Data.xlsx","Sheet1");
    }
}
