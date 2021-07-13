package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	       WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			//Load the URL
			
			driver.get("http://www.leafground.com/pages/table.html");
			
			//Maximize screen
			
			driver.manage().window().maximize();
			
			String values = driver.findElement(By.ByXPath.className("//table[@id='table_id']//tr[2]/td[2]")).getAttribute("td");
			
			System.out.println(values);
		
	}

}
