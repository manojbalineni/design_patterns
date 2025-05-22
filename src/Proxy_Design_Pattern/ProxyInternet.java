package Proxy_Design_Pattern;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet{

    private Internet realInternet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = Arrays.asList("abc.com", "xyz.com");
    }

    public void connectTo(String serverHost) {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            System.out.println("Access Denied to : " + serverHost);
        }
        else{
            realInternet.connectTo(serverHost);
        }

    }
}
