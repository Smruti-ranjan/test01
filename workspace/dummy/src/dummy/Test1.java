package dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd= new FirefoxDriver();
		wd.get("https://google.com");
	}

}
