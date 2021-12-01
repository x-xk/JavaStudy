## BufferedInputStream,BufferedOutputStream

- 利用BufferedInputStream和BufferedOutputStream复制文本文件

  ```java
  import java.io.*;
  
  public class Copy03 {
      public static void main(String[] args) throws IOException {
          File file1 = new File("D:\\test.txt");
          File file2 = new File("D:\\tets_copy.txt");
          FileInputStream fileInputStream = new FileInputStream(file1);
          FileOutputStream fileOutputStream = new FileOutputStream(file2);
          BufferedInputStream bis = new BufferedInputStream(fileInputStream);
          BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
          byte[] b = new byte[1024*10];
          int len;
          while((len=bis.read(b))!=-1){
              bos.write(b,0,len);
          }
          bos.close();
          bos.close();
      }
  }
  ```

- 利用BufferedInputStream和BufferedOutputStream复制非文本文件

  ```java 
  import java.io.*;
  
  public class Copy03 {
      public static void main(String[] args) throws IOException {
          File file1 = new File("D:\\test.jpg");
          File file2 = new File("D:\\test_copy.jpg");
          FileInputStream fileInputStream = new FileInputStream(file1);
          FileOutputStream fileOutputStream = new FileOutputStream(file2);
          BufferedInputStream bis = new BufferedInputStream(fileInputStream);
          BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
          byte[] b = new byte[1024*10];
          int len;
          while((len=bis.read(b))!=-1){
              bos.write(b,0,len);
          }
          bos.close();
          bos.close();
      }
  }
  ```



---

