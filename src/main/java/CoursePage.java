import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class CoursePage {

    @FindBy (xpath = "//*[contains(@class,\"course-list\")and contains(@class,\"course-list_item\")]")
    static
    List<WebElement> coursesList;

    @FindBy( id = "coursesMenuSearchField")
    WebElement searchField;


    static WebDriver driver;
    public CoursePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  static List<String> getCourseList(String item) {
        driver.findElement(searchField).sendKeys();
        for (WebElement i  : coursesList){
            String name = i.findElement(By.className("course-label_name")).getText();

        return new Object[];
    }



}

