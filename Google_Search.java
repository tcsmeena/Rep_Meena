package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	/*public void fn1()
	{
		System.setProperty("webdriver.chrome.driver","F://Selenium//chromedriver.exe");
		ChromeDriver o1 = new ChromeDriver();
		o1.manage().window().maximize();
		o1.get("http://www.google.com");
		o1.findElementByName("q").sendKeys("flowers");
		o1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Boolean b1 = o1.findElementByXPath("//div[text()='flowers']/b[text()=' pictures']").isEnabled();
		System.out.println(b1);
		o1.findElementByXPath("//div[text()='flowers']/b[text()=' pictures']").click();
	}*/
	
	public void fn1()
	{
		System.setProperty("webdriver.chrome.driver","F://Selenium//chromedriver.exe");
		ChromeDriver o1 = new ChromeDriver();
		o1.manage().window().maximize();
		o1.get("http://www.google.com");
		o1.findElementByName("q").sendKeys("flowers");
		o1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> L1 = o1.findElementsByXPath("//div[@class='sbqs_c']");
		int L2 = L1.size();
		System.out.println(L2);
		for (int i = 0;i< L2;i++)
		{
			System.out.println(L1.get(i).getText());
			if (L1.get(i).getText().equalsIgnoreCase("flowers pictures"))
			{			
				L1.get(i).click();
				break;
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google_Search o1 = new Google_Search();
		o1.fn1();
	}
}
