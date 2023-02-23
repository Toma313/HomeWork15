import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoursePage {

    @FindBy(xpath = "//div[@id=\"coursesMenuSearchPanel\"]//p[@class=\"course-label_name\"]")
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

    public  List<String> getCourseList(String item) {
        searchField.sendKeys(item);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<String> list = new ArrayList<>();
        for (WebElement i : coursesList) {
            list.add(i.getText());
        }
        return list;
    }
}

