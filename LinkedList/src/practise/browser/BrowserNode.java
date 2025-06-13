package practise.browser;

public class BrowserNode {
	public String url;
	public BrowserNode next;
	public BrowserNode prev;
	
	public BrowserNode(String url) {
		this.url = url;
		this.next = null;
		this.prev = null;
	}
}
