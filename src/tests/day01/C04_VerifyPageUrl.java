package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    public static void main(String[] args) {
        //Yeni bir class olusturalim : (VerifyURLTest)
        // Youtube ana sayfasina gidelim https://www.techproeducation.com/
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Serdar\\Documents\\selenium dependencies\\drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        //Sayfa URL’inin www. techproeducation.com oldugunu dogrulayin
    String expectedUrl="www.techproeducation.com";
    String actualUrl=driver.getCurrentUrl();

    if (expectedUrl.equals(actualUrl)){
        System.out.println("Test PASS");
    }else {
        System.out.println("Test FAILED");
        System.out.println("gecerli url :"+driver.getCurrentUrl());
    }
driver.close();
    }
}
