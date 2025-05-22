package Proxy_Design_Pattern;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("geeksforgeeks.org");
        internet.connectTo("abc.com");

    }
}
