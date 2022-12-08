import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JumiaWebTest {
    private WebDriver driver;
    @BeforeTest
    public void setup() throws InterruptedException {
        //locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1. open your chrome browser
        driver = new ChromeDriver();
        //2. input your Jumia Demo page URL (https://www.jumia.com/)
        driver.get("https://www.jumia.com/");
        Thread.sleep(10000);
        //3. Maximize the browser
        driver.manage().window().maximize();
        //4. click the account button
        driver.findElement(By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")).click();
        //5. Click on the Login Button
        driver.findElement(By.xpath("//*[@id=\"dpdw-login-box\"]/div/div/a")).click();
    }
       @Test (priority=0)
               public void correctSignin() throws InterruptedException {
        //6. Input your email address
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input")).sendKeys("wunmmytinux@gmail.com");
        //7.Click on the continue button
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button/span[3]")).click();
        Thread.sleep(10000);
        //8. Input your password
        driver.findElement(By.xpath("//*[@id=\"passwordForm\"]/div[2]/div[3]/label/input")).sendKeys("Olamilekan1@");
        //9. Click on the Login button
        driver.findElement(By.xpath("//*[@id=\"loginButton\"]/span[3]")).click();
        Thread.sleep(10000);
        //10. Click on user account button
        driver.findElement(By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")).click();
        //11. Click on the Logout button
        driver.findElement(By.xpath("//*[@id=\"dpdw-login-box\"]/div/form/button")).click();
    }

    @Test (priority = 1)
    public void wrongUsername() throws InterruptedException {
        //4. click the account button
        driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/label")).click();
        //5. Click on the Login Button
        driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/div/div/div/a")).click();
        //6. Input your email address
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input")).sendKeys("dammy@gmail.com");
        //7.Click on the continue button
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button/span[3]")).click();
        Thread.sleep(10000);
        //8. Input your password
        driver.findElement(By.xpath("//*[@id=\"passwordForm\"]/div[2]/div[3]/label/input")).sendKeys("Olamilekan1@");
        //9. Click on the Login button
        driver.findElement(By.xpath("//*[@id=\"loginButton\"]/span[3]")).click();
        Thread.sleep(10000);


    }

    @Test (priority = 2)
    public void wrongPassword() throws InterruptedException {
        driver.get("https://www.jumia.com/");
        //4. click the account button
        driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/label")).click();
        //5. Click on the Login Button
        driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/div/div/div/a")).click();
        //6. Input your email address
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input")).sendKeys("olufemiwunmi1@gmail.com");
        //7.Click on the continue button
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button/span[3]")).click();
        Thread.sleep(8000);
        //8. Input your password
        driver.findElement(By.xpath("//*[@id=\"passwordForm\"]/div[2]/div[3]/label/input")).sendKeys("Ola1@");
        //9. Click on the Login button
        driver.findElement(By.xpath("//*[@id=\"loginButton\"]/span[3]")).click();
        Thread.sleep(10000);

    }


    @Test (priority = 3)
    public void blankFields() throws InterruptedException {
        driver.get("https://www.jumia.com/");
        //4. click the account button
        driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/label")).click();
        //5. Click on the Login Button
        driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/div[1]/div/div/div/a")).click();
        //6. Input your email address
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input")).sendKeys("");
        //7.Click on the continue button
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button/span[3]")).click();
        Thread.sleep(8000);
        
    }




        @AfterTest
                public void closeBrowser() {
            //12. Quit the browser
            driver.quit();
        }
    }









