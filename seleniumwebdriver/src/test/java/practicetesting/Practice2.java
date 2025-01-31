package practicetesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
		
		//open the url 
		driver.get("https://demo-opencart.com/");
		
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("Not passed");
		}

	}

}
