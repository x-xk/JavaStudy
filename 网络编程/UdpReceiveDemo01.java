package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//接收端
public class UdpReceiveDemo01 {
    public static void main(String[] args) throws IOException {
        //1.开放端口
        DatagramSocket socket=new DatagramSocket(9090);
        //2.接收数据
        byte[] b=new byte[1024];
        DatagramPacket packet=new DatagramPacket(b,b.length);
        socket.receive(packet);
//        byte[] data=packet.getData();
        System.out.println(new String(packet.getData()));
        //3.关闭资源
        socket.close();
    }
}
