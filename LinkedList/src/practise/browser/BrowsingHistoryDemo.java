package practise.browser;

import java.util.List;

public class BrowsingHistoryDemo {
	
	public static void main(String[] args) {
		BrowsingHistory browser = new BrowsingHistory("google.com");
		browser.visitingUrl("fb.com");
		browser.visitingUrl("fc.com");
		browser.visitingUrl("fd.com");
		browser.visitingUrl("fe.com");
		browser.visitingUrl("ff.com");
		List<String> urls = browser.printUrls();
		for (String url : urls) {
			System.out.println(url);
		}
		System.out.println(browser.movingBack(2));
		System.out.println(browser.movingBack(2));
		System.out.println(browser.movingForward(2));
		
	}

}
