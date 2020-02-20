package Pages;

import Base.Driver;
import Base.base;
import Utils.ConfigReader;
import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PortsofDeparturePage extends base
{
    private static By port= By.xpath(" //*[@title='Ports'][1]");
    private static WebDriver driver=driver();


    public static WebDriver driver(){

    WebDriver driver= Driver.getDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    return driver;


}
public static void visitHomePage() {
    driver.get(ConfigReader.getProperty("url"));
}
}
