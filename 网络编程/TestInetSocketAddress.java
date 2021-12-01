package 网络编程;

import java.net.InetSocketAddress;

public abstract class TestInetSocketAddress {
    public static void main(String[] args) {
        InetSocketAddress socketAddress=new InetSocketAddress("localhost",8080);
        System.out.println(socketAddress);
        System.out.println(socketAddress.getAddress());
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress.getHostString());
        System.out.println(socketAddress.getPort());
    }
}
