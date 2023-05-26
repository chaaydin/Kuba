package lambda_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

    //https://www.lambdatest.com/selenium-playground >>input form sign up and get sth from submit
  @Test
  public void TC_01(){
      WebDriverManager.chromedriver().setup();
      ChromeOptions options= new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      WebDriver driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://demo.opencart.com/admin/");



  }


}
