import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class DropdownAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/SeleniumFiles/dropdown.html");

        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("05");

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("05");

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("2005");

        System.out.println("Selected: " + day.getFirstSelectedOption().getText() + "-" +
                           month.getFirstSelectedOption().getText() + "-" +
                           year.getFirstSelectedOption().getText());

        List<WebElement> yearOptions = year.getOptions();
        List<String> years = new ArrayList<>();
        for (WebElement opt : yearOptions) years.add(opt.getText());

        List<String> sortedYears = new ArrayList<>(years);
        Collections.sort(sortedYears);
        if (years.equals(sortedYears)) System.out.println("Years in Ascending Order");
        else System.out.println("Years NOT in order");

        driver.quit();
    }
}
