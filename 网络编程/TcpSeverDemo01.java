package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class TcpSeverDemo01 {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket server=null;
        DataInputStream dis=null;
        try {
            //1.设置服务器端口
            serverSocket=new ServerSocket(9999);
            while (true) {
                //2.等待客户端连接
                server=serverSocket.accept();
                //3.读取客户端消息
                dis=new DataInputStream(server.getInputStream());
                System.out.println(dis.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            if (dis!=null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (server!=null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket!=null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
