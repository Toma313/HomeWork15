import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class CoursePage {

    @FindBy(xpath = "//div[@id=\"coursesMenuSearchField\"]//input[@class=\"search-field_input\"]")
    static
    List<WebElement> coursesList;

    @FindBy(xpath = "//*[@id=\"coursesMenuSearchField\"]/input")
    static
    WebElement searchField;


    static WebDriver driver;

    public CoursePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static List<String> getCourseList(String item) {
        driver.findElement((By) searchField).sendKeys(item);

        for (WebElement i : coursesList) {
            String name = i.findElement(By.className("course-label_name")).getText();
            return new Object[][]{name};
        }
    }
}

