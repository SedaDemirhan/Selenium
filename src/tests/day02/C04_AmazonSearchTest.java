package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_AmazonSearchTest {
    public static void main(String[] args) {
        //1. Bir class oluşturun :AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Serdar\\Documents\\selenium dependencies\\drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //a.amazon web sayfasına gidin. https://www.amazon.com/

        driver.get(" https://www.amazon.com/");


        //b. Search(ara) “city bike”
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);


        //c. Amazonda'da görüntülenen ilgili sonuçların sayısını yazdırın

        WebElement sonucSayısı=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucSayısı.getText());


        //d. “Shopping” e tıklayın.
        WebElement shoppingTıkla= driver.findElement(By.linkText("Today's Deals"));
        shoppingTıkla.click();


        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ilkSonucTıkla= driver.findElement(By.xpath("//*[@id=\"dealImage\"]/div/div/div[2]"));
        ilkSonucTıkla.click();


    }
}
