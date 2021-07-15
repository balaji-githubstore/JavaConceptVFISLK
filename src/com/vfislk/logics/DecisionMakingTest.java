package com.vfislk.logics;

public class DecisionMakingTest {

	public static void main(String[] args) {
		String browser = "CH";
		// launch browser
		if (browser == "ch" || browser=="CH") {
			System.out.println("launch chrome browser");
		} else if (browser == "ff") {
			System.out.println("launch firefox browser");
		} else if (browser == "edge") {
			System.out.println("launch edge browser");
		} else {
			System.out.println("launch internet explorer browser");
		}

	
		
		switch (browser) {
		case "ch":
		case "CH":
			System.out.println("launch chrome browser");
			break;
		case "ff":
			System.out.println("launch firefox browser");
			break;
		case "edge":
			System.out.println("launch edge browser");
			break;
		default:
			System.out.println("launch internet explorer browser");
			break;
		}
		
//		if(mark>80)
//		{
//			if(mark<89)
//			{
//				System.out.println("between 80 to 89 mark- "+mark);
//			}
//		}
		
		System.out.println("end");
	}

}
