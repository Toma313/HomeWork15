import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button")
    WebElement elementCourse;

    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button")
          WebElement courseButton;


    WebDriver driver;
    public CoursePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //boolean eleSelected= driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button")).isDisplayed();
}
//    public void sendCourseForm(String textInput) throws InterruptedException {
//        this.textInput.sendKeys(textInput);
//        confirmButton.click();
//        Thread.sleep(3000);
//    }
