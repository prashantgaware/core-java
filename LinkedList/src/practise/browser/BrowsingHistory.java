package practise.browser;

import java.util.ArrayList;
import java.util.List;

public class BrowsingHistory {
	private BrowserNode current;

	public BrowsingHistory(String url) {
		current = new BrowserNode(url);
	}
	
	void visitingUrl(String url) {
		BrowserNode newUrl = new BrowserNode(url);
		current.next = newUrl;
		newUrl.prev = current;
		current = newUrl;
	}
	
	String movingBack(int steps) {
		while (current.prev != null && steps > 0) {
			current = current.prev;
			steps--;
		}
		
		return current.url;
	}
	
	String movingForward(int steps) {
		while (steps > 0 && current.next != null) {
			current = current.next;
			steps--;
		}
		
		return current.url;
	}
	
	List<String> printUrls() {
		BrowserNode nodes = current;
		while (nodes.prev != null) {
			nodes = nodes.prev;
		}
		List<String> urls = new ArrayList<String>();
		while (nodes.next != null) {
			urls.add(nodes.url);
			nodes = nodes.next;
		}
		
		return urls;
	}
}
