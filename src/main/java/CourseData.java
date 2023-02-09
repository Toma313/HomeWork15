import org.testng.annotations.DataProvider;

public class CourseData {

    @DataProvider
    public Object [][] gerCourse(){
        return new Object[][]{
                {"Content"},
                {"Basic Java"},
                {"Front-end Basic"},
                {"QA Manual"},
                {"QA Automation"}
        };
    }
}

