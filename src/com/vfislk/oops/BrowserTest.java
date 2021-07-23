package com.vfislk.oops;

interface WebDriver1
{
	public abstract void get(String url); //navigate
	String getTitle();
	void quit();
	
	
}
interface JavascriptExecutor1
{
	void executeScript();
}

interface TakeScreenshot1
{
	void getScreenshot();
}

class ChromeDriver1 implements WebDriver1,TakeScreenshot1,JavascriptExecutor1
{
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}
	
	public void chromeTest()
	{
		
	}

	@Override
	public void executeScript() {
		// TODO Auto-generated method stub
		
	}
	
}

class FirefoxDriver1 implements WebDriver1,TakeScreenshot1
{

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}
}

//class XBrowser implements WebDriver1
//{
//
//	@Override
//	public void get(String url) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public String getTitle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void quit() {
//		// TODO Auto-generated method stub
//		
//	}
	
//}



public class BrowserTest {

	public static void main(String[] args) {
		
		WebDriver1 driver=new ChromeDriver1(); //browser 1

		driver.get("");
		driver.quit();
		driver.get("");
		//driver.getScreenshot();
		
		JavascriptExecutor1 js=(JavascriptExecutor1) driver;
		js.executeScript();
		
		TakeScreenshot1 ts= (TakeScreenshot1) driver; //browser2
		
		ts.getScreenshot();
		
//		FirefoxDriver1 fx= (FirefoxDriver1) driver;
		
//		fx.getScreenshot();
		
//		driver.chromeTest();

	}

}



