
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-debugging-port=9222");
        chromeOptions.addArguments("--no-sandbox");
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Storing the Application Url in the String variable
        String url = "https://www.gmail.com";
        // Launch the localhost WebSite
        driver.get(url);

        driver.findElement(By.id("identifierId")).sendKeys("hhe50499", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("!!!123HHE", Keys.ENTER);
        Thread.sleep(8000);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=':2n']")).click();
        System.out.println("Unread email opened");
        Thread.sleep(4000);
        WebElement myelement = driver.findElement(By.cssSelector("img.hB.T-I-J3"));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].scrollIntoView()", myelement);
        jse2.executeScript("arguments[0].click();", myelement);
        System.out.println("Opened reply window");
        Thread.sleep(4000);
        String keysPressed = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(By.cssSelector(".editable")).sendKeys("This is my reply!", keysPressed);
        Thread.sleep(2000);
    }
}