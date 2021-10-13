package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun: LocatorsIntro
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Serdar\\Documents\\selenium dependencies\\drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //a. http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        WebElement signInLinki= driver.findElement(By.linkText("Sign in"));
        signInLinki.click();


        //c.email textbox,password textbox, and signin button elementlerini locate ediniz
        Thread.sleep(2000);

        WebElement emailTextBox=driver.findElement(By.id("session_email"));

        WebElement passwordTextBox= driver.findElement(By.id("session_password"));

        WebElement signInButonu= driver.findElement(By.name("commit"));

        //d.Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign i n)buttonunu tıklayın:
        //i. Username :testtechproed@gmail.com
        //ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement dogruKullanıcı= driver.findElement(By.className("navbar-text"));

        String userName="testtechproed@gmail.com";

        if (dogruKullanıcı.getText().equals(userName)) {
            System.out.println("dogru kullanıcı testi PASS");
        }else{
            System.out.println("dogru kullanıcı testi FAILED");
        }
        //f.“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesLink=driver.findElement(By.linkText("Addresses"));

        WebElement signOutLinki=driver.findElement(By.linkText("Sign out"));

        if(adressesLink.isDisplayed()){
            System.out.println("adresses linki gorunuyor,TEST PASS");
        }else{
            System.out.println("adresses linki görünmüyor,TEST FAILED");
        }
        if(signOutLinki.isDisplayed()){
            System.out.println("signout linki gorunuyor,TEST PASS");
        }else{
            System.out.println("signout linki görünmüyor,TEST FAILED");
        }


        //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linkler=driver.findElements(By.tagName("a"));
        System.out.println("sitenin giriş sayfasında olan link sayısı:"+linkler.size());

        //linklerin yazılarını yazdıralım
        //elimizdeki listedki tüm webelementlerin yazılarını for loop veya for each loop ile yazdırabilirz
        //tüm elementler yazdırılacaksa  foor-each loop kullanışlı olur

        int sıra=1;
        for (WebElement each:linkler
             ) {
            System.out.println(sıra+" "+each.getText());
            sıra++;
        }


driver.close();

    }
}
