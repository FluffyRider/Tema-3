package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Register {

    public WebDriver driver;

    @Test
    public void metodaTest() {

        driver = new EdgeDriver();

        driver.get("https://tidb-cloud-starter-ten-orcin.vercel.app/");

        driver.manage().window().maximize();



        WebElement dropDownButton = driver.findElement(By.className("dropdown"));
        dropDownButton.click();

        WebElement bookType = driver.findElement(By.className("dropdown"));
        bookType.click();
        WebElement magazineButton = driver.findElement(By.className("magazine"));
        magazineButton.click();

        //WebElement firstnameButtonElement = driver.findElement(By.id("FirstName"));
        //String firstnamevalue = "Dascalu";
        //firstnameButtonElement.sendKeys(firstnamevalue);

        //WebElement lastnameButtonElement = driver.findElement(By.id("LastName"));
        //String lastnamevalue = "marius";
        //lastnameButtonElement.sendKeys(lastnamevalue);


        //WebElement dayElement = driver.findElement(By.name("DateOfBirthDay"));
        //Select daySelect = new Select(dayElement);
        //daySelect.selectByVisibleText("17");

        //WebElement monthElement = driver.findElement(By.name("DateOfBirthMonth"));
        //Select monthSelect = new Select(monthElement);
        //monthSelect.selectByVisibleText("August");

        //WebElement yearElement = driver.findElement(By.name("DateOfBirthYear"));
        //Select yearSelect = new Select(yearElement);
        //yearSelect.selectByVisibleText("1982");

       /* try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        */}

        //WebElement emailElement = driver.findElement(By.id("Email"));
        //String emailValue= "d;lkasjdsalkd@yahoo.com";
        //emailElement.sendKeys(emailValue);\



    }




