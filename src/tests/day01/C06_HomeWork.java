package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_HomeWork {
    public static void main(String[] args) {
        //1.Yeni bir class olusturalim (Homework)

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Serdar\\Documents\\selenium dependencies\\drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        String expectedTitle="facebook";
        String actualTitle=driver.getTitle();

        if(expectedTitle==actualTitle){
            System.out.println("verify");
        }else{
            System.out.println("actual title :"+driver.getTitle());
        }

 //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.

        String expectedUrl="facebook";
        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("sayfa url'si "+ expectedUrl+" içermektedir");
        }else{
            System.out.println("Actual Url :"+driver.getCurrentUrl());
        }
        //4.https://www.walmart.com/ sayfasina gidin.

        driver.navigate().to("https://www.walmart.com/");

        //5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        String expectedTitleWalmart="Walmart.com";
        String actualTitleWalmart=driver.getTitle();

        if (actualTitleWalmart.contains(expectedTitleWalmart)){
            System.out.println("sayfa baslığı "+expectedTitleWalmart+" içermektedir");
        }else{
            System.out.println("sayfa başlığı :"+ driver.getTitle());
        }


        //6. Tekrar “facebook” sayfasina donun

        driver.navigate().back();

        //7.Sayfayi yenileyin

        driver.navigate().refresh();

        //8.Sayfayi tam sayfa (maximize) yapin

        driver.manage().window().maximize();

        //9.Browser’i kapatin

        driver.close();
    }
}
