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
        driver.get("https://ithillel.ua/ua");
        coursePage = new CoursePage(driver);
    }

    @Test
        public void test1(){
        boolean eleSelected= driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button")).isDisplayed();
        Assert.assertTrue(eleSelected);
    }
    @Test(dataProvider = "getCourses",dataProviderClass = CourseData.class)
    public void test2(String item, List<String> expected){
        driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button")).click();
        List<String> actual = coursePage.getCourseList(item);
        Assert.assertEquals(expected,actual);

    }



}
