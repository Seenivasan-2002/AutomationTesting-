package marathan.week2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Servicenow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
//		. Launch ServiceNow application
		driver.get("https://dev264424.service-now.com/");
//		2. Login with valid credentials username as admin and password 
//		3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
//		4. Click on  mobiles
//		5. Select Apple iphone13pro
//		6. Choose yes option in lost or broken iPhone
//		7. Enter phonenumber as 99 in original phonenumber field
//		8. Select Unlimited from the dropdown in Monthly data allowance
//		9. Update color field to SierraBlue and storage field to 512GB
//		10. Click on Order now option
//		11. Verify order is placed and copy the request number
//		12.Take a Snapshot of order placed page        
	}

}
