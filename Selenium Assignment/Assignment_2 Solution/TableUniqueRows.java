import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class TableUniqueRows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/SeleniumFiles/Assignment.html");

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr[position()>1]"));
        Set<String> unique = new HashSet<>();
        for (WebElement row : rows) unique.add(row.getText());

        System.out.println("Unique Rows Count: " + unique.size());
        for (String r : unique) System.out.println(r);
        driver.quit();
    }
}