package login;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//xpath
		String btn_loginRegister = "//span[contains(text(),'Register/Login')]";
		String txt_email = "//input[@id='loginEmail']";
		String txt_pass = "//input[@placeholder='Enter Password']";
		String btn_login ="//button[contains(text(),'Login')]";
		String btn_logout ="//span[contains(text(),'Logout')]";
		
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khanh\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://anotepad.com/";
		String baseUser = "khanh_nguyenkg@yopmail.com";
		String basePass ="Qwe123456";
		
		
		
		
		// launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        driver.findElement(By.xpath(btn_loginRegister)).click();
        driver.findElement(By.xpath(txt_email)).sendKeys(baseUser);
        driver.findElement(By.xpath(txt_pass)).sendKeys(txt_pass);
        driver.findElement(By.xpath(btn_login)).click();
        
        boolean check = driver.findElement(By.xpath(btn_logout)).isDisplayed();
        
        if (check == true){
        	System.out.println("Test Passed!");
        }else{
        	System.out.println("Test Failed");
        }        
        driver.close();
		
	}

}
