package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {

    public static void main(String[] args) {
        //Yeni bir Class olusturalim. (VerifyTitle)
    //Amazon ana sayfasina gidelim . https://www.amazon.com/
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Serdar\\Documents\\selenium dependencies\\drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

    //Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)
        String expectedTitle="amazon";
        String actualTitle= driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen deger ile aynı,test PASS");
        }else{
            System.out.println("title beklenenden farklı,test FAILED");
            System.out.println("aktuel title :"+driver.getTitle());
        }
        driver.close();
}
}
