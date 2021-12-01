package 网络编程;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class TcpClientDemo01 {
    public static void main(String[] args) {
        DataOutputStream dos=null;
        Socket socket=null;
        try {
            //1.得到服务器的IP和port
            InetAddress serverIp=serverIp=InetAddress.getByName("localhost");
            int port=8080;
            //2.创建socket连接
            socket=new Socket(serverIp,port);
            //3.发送消息
            dos=new DataOutputStream(socket.getOutputStream());
            dos.writeUTF("hello,netcode");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (dos!=null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
