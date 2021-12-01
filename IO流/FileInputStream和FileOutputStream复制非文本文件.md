## FileInputStream,FileOutputStream

- FileInputStream读取文本文件

  ```java
  import java.io.File;
  import java.io.FileInputStream;
  import java.io.IOException;
  
  public class FileInputStreamDemo {
      public static void main(String[] args) throws IOException {
          File file = new File("D:\\test.test");
          FileInputStream fileInputStream = new FileInputStream(file);
          /*int n;
          while((n=fileInputStream.read())!=-1){
              System.out.print((char) n);
          }*/
          byte[] b = new byte[1024*10];
          int len;
          while((len=fileInputStream.read(b))!=-1){
              for(int i=0;i<len;i++){
                  System.out.print((char) b[i]);
              }
          }
          fileInputStream.close();
      }
  }
  ```

  

- 利用FileInputStream和FileOutputStream复制非文本文件

  ```java
  import java.io.*;
  
  public class Copy02 {
      public static void main(String[] args) throws IOException {
          File file1 = new File("D:\\test.jpg");
          File file2 = new File("D:\\test_copy.jpg");
          FileInputStream fileInputStream = new FileInputStream(file1);
          FileOutputStream fileOutputStream = new FileOutputStream(file2);
          /*int n;
          while((n=fileInputStream.read())!=-1){
              fileOutputStream.write(n);
          }*/
          byte[] b = new byte[1024*10];
          int len;
          while((len=fileInputStream.read(b))!=-1){
              fileOutputStream.write(b,0,len);
          }
          fileOutputStream.close();
          fileInputStream.close();
      }
  }
  
  ```
  
  