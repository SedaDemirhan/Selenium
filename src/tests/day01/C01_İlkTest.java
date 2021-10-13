package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_İlkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Serdar\\Documents\\selenium dependencies\\drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("şu andaki URL:"+ driver.getCurrentUrl());

        System.out.println("şu anki başlık :"+driver.getTitle());

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        //driver.quit(); quit açık olan tüm browswrları kapatırken close sadece 1 browser kapatır



        driver.close();

    }
}
