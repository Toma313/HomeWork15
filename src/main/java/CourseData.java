import org.testng.annotations.DataProvider;

import java.util.Arrays;

public class CourseData {
    @DataProvider
    public static Object[][] getCourses(){
        return new Object[][]{
                {"QA", Arrays.asList("QA Manual","QA Automation","QA Automation — Python","Сертифікація ISTQB для тестувальників")},
                {"Basic Java", Arrays.asList("Java Basic", "Основи Java для школярів")},
                {"Front-end для", Arrays.asList("Основи Front-end для школярів", "Front-end для школярів. Рівень 2")},
                {"Web", Arrays.asList("Основи Web дизайну", "Основи Web-дизайну для школярів", "Web-дизайн для школярів. Рівень 2")},
                {"QA Automation", Arrays.asList("QA Automation", "QA Automation — Python")}

        };
    }
}
