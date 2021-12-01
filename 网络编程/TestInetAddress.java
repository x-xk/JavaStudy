package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) {
        try {
            //查本机ip
            InetAddress inetAddress1=InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);
            InetAddress inetAddress3=InetAddress.getLocalHost();
            System.out.println(inetAddress3);
            InetAddress inetAddress4=InetAddress.getByName("DELL");
            System.out.println(inetAddress4);
            InetAddress inetAddress5=InetAddress.getByName("localhost");
            System.out.println(inetAddress5);
            //查网站ip
            InetAddress inetAddress2=InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
