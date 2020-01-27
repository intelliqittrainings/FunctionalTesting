import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;


public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://localhost:8899/qaenv/");
		System.out.println(driver.getCurrentUrl());
		String expmsg="Hello, World!";
		String actmsg=driver.findElement(By.xpath("html/body")).getText();
		System.out.println("Expected Message : "+expmsg);
		System.out.println("Actual Message   : "+actmsg);
		if(expmsg.equals(actmsg))
		{
			System.out.println("Testing has Passed");
		}
		else
		{
			System.out.println("Testing has Failed");
		}
		driver.close();
	}

	}

