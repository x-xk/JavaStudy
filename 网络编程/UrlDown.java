package 网络编程;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
/*
利用URL下载资源
 */
public class UrlDown {
    public static void main(String[] args) throws IOException {
        //1.下载地址
        URL url = new URL("https://m801.music.126.net/20211130102326/8b29d049dc6c3b38b0461cbd311c87d1/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/11231187855/4cf5/f639/c6cd/52afbbd5d65258f9d1865895159cfeb6.m4a");
        //2.连接到资源
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        //3.下载
        BufferedInputStream bis = new BufferedInputStream(urlConnection.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Test02.m4a"));
        byte[] b = new byte[1024];
        int len;
        while((len=bis.read(b))!=-1){
            bos.write(b,0,len);
        }
        bos.close();
        bis.close();
        urlConnection.disconnect();
    }
}
