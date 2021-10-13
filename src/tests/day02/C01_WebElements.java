package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {
        //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
        // placeholder="E-posta veya Telefon Numarası" autofocus="1" aria-label="E-posta veya Telefon Numarası">


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Serdar\\Documents\\selenium dependencies\\drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://tr-tr.facebook.com/");

        //email textbox'a Ali yazdıralım

       WebElement mailTextBox=driver.findElement(By.id("email"));

       mailTextBox.sendKeys("aliseleniumcu@gmail.com");
       Thread.sleep(2000);

       mailTextBox.clear();
       WebElement mailKutusuTagNameIle=driver.findElement(By.tagName("input"));

       //mailKutusuTagNameIle.sendKeys("veliGocer@gmail.com");
        // *****bunu bulamadı çünkü birden fazla input olduğu için
        //***yazdığımız locator unique olması lazım


       // WebElement yanlısElement= driver.findElement(By.id("emailyanlis"));
        //yanlısElement.sendKeys("yanlışeleman");
        // NoSuchElementException = locatorsda hata var demektir

        //GİRİŞ YAP BUTONUNA TIKLAYALIM
        WebElement girişButonu=driver.findElement(By.tagName("button"));
        System.out.println(girişButonu.isEnabled());
        girişButonu.click();


    }
}
