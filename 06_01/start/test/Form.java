import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/hpateliya/Documents/chromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("hemali");

        driver.findElement(By.id("last-name")).sendKeys("pateliya");

        driver.findElement(By.id("job-title")).sendKeys("SD");

        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("08/23/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);


        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();




        driver.quit();
    }
}
