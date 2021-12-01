package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//发送端
public class UdpSendDemo01 {
    public static void main(String[] args) throws IOException {
        //1.建立一个Socket
        DatagramSocket socket = new DatagramSocket();

        //2.确定接受方的IP和port
        InetAddress localhost=InetAddress.getByName("localhost");
        int port=9090;

        //3.确定消息，建立包
        String msg = "hello";
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, localhost,port);

        //4.发送包
        socket.send(packet);

        //5.关闭资源
        socket.close();
    }
}
