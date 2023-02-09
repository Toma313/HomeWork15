import config.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class TestCourse extends BaseClass {
    CoursePage coursePage;

    @BeforeMethod
    public void befor(){
        driver.get("https://ithillel.ua/ua");}

    @Test
        public void test1(){
        boolean eleSelected= driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button")).isDisplayed();
        Assert.assertTrue(eleSelected);
    }
    @BeforeTest
    public void beforeTest(){
        driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button")).click();
    }
    @Test
    public void test2(){

    }



}
