package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) throws Exception
	{
		// set "chrome" driver" as per "chrome" version in our computer 
		System.setProperty("webdriver.chrome.driver","C:\\mahesh251\\chromedriver_win32\\chromedriver.exe");
		//SWD code can use browser driver software to give required effect in browser
		ChromeDriver driver=new ChromeDriver();
		//lunch site under testing(SUT)
		driver.get("http://www.sentia.in");//base url as argument
		Thread.sleep(5000);
		//get curent url which is generated by browser
		String t=driver.getCurrentUrl();
		if(t.startsWith("https"))
		{
			System.out.println("secured site");
		}
		else
		{
			System.out.println("not a secured site");
		}
		//close site
		driver.close();

	}

}
