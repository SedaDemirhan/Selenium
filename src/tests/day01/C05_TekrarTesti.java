package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.EventListener;

public class C05_TekrarTesti {
    public static void main(String[] args) {
        //1. Yeni bir class olusturun (TekrarTesti)
//2.Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
//(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Serdar\\Documents\\selenium dependencies\\drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");

        String expectedTitle="youtube";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("actual title :"+driver.getTitle());
        }
//3. Sayfa URL'sinin “youtube” içerip içermediğini
//(contains) doğrulayın, içermiyorsa doğru
//URL'yi yazdırın.
        String expectedUrl="youtube";
        String actualUrl= driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("actual Url "+ expectedUrl+" "+" kelimesini içermektedir");
        }else{
            System.out.println("actual Url "+driver.getCurrentUrl());
        }


//4. Daha sonra
//Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
//5. Youtube sayfasina geri donun
        driver.navigate().back();
//6. Refr
//Sayfayi yenileyin
        driver.navigate().refresh();
//7. Amazon sayfasina donun
        driver.navigate().forward();
//8.Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
//9. Ardından sayfa başlığının "Amazon" içerip içermediğini
//(contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.

        String expectedTitleAmazon="Amazon";
        String actualTitleAmazon=driver.getTitle();
        if(actualTitleAmazon.contains(expectedTitleAmazon)){
            System.out.println("Sayfa başlığı"+expectedTitleAmazon+" kelimesini içermektedir");
        }else{
            System.out.println("sayfa başlığı"+expectedTitleAmazon+" içermemektedir.Doğru baişlık"+driver.getTitle());
        }

//10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın

        String expectedUrlAmazon="https://www.amazon.com/";
        String actualUrlAmazon= driver.getCurrentUrl();
        if (expectedUrlAmazon==actualUrlAmazon){
            System.out.println("PASS");
        }else {
            System.out.println("actualUrl"+ " "+ driver.getCurrentUrl());
        }
        //11.Sayfayi kapatin
        driver.quit();
    }
}
