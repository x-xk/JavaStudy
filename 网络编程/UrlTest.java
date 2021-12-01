package 网络编程;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.baidu.com");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getQuery());
    }
}
