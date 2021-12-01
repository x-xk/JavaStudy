## FileReader,FileWriter

- FileReader读取文件

  ```java 
  import java.io.File;
  import java.io.FileReader;
  import java.io.IOException;
  
  public class FileReaderDemo {
      public static void main(String[] args) throws IOException {
          File file = new File("D:\\test.txt");
          FileReader fileReader = new FileReader(file);
          //一次读取一个字符
          /*int n;
          while((n=fileReader.read())!=-1){
              System.out.print((char)n);
          }*/
          //利用缓冲数组，一次读取多个字符
          char[] ch = new char[5];
          int len;
          while((len=fileReader.read(ch))!=-1){
              //将读取到字符数组输出
              /*for(int i=0;i<len;i++){
                  System.out.print(ch[i]);
              }*/
              //将读取的字符数组转换成字符串输出
              System.out.print(new String(ch,0,len));
          }
          fileReader.close();
      }
  }
  ```

  

- FileWriter写入文件

  ```java
  import java.io.File;
  import java.io.FileWriter;
  import java.io.IOException;
  
  public class FileWriterDemo {
      public static void main(String[] args) throws IOException {
          File file = new File("D:\\test_copy.txt");
          FileWriter fileWriter = new FileWriter(file,false);//对源文件进行覆盖操作，默认false
          //FileWriter fileWriter = new FileWriter(file,true);对源文件进行追加操作
          String str = "...";
          fileWriter.write(str);
          /*利用缓冲数组，写入数据
          String str = "...";
          char[] ch = str.toCharArray();
          fileWriter.write(ch);
          */
          /*一次写入一个字符
          for(int i=0;i<str.length;i++){
          	fileWriter.write(str.charAt(i));
          }
          */
          fileWriter.close();
      }
  }
  ```

  

- 利用FileReader和FileWriter复制文件

  ```java 
  import java.io.*;
  
  public class Copy01 {
      public static void main(String[] args) throws IOException {
          File file1 = new File("D:\\test.txt");
          File file2 = new File("D:\\test_copy.txt");
          FileReader fileReader = new FileReader(file1);
          FileWriter fileWriter = new FileWriter(file2);
          //读取一个字符，写入一个字符
          /*int n;
          while((n=fileReader.read())!=-1){
              fileWriter.write((char)n);
          }*/
          //利用缓冲数组，读取字符，写入字符
          /*char[] ch = new char[5];
          int len;
          while((len=fileReader.read(ch))!=-1){
              fileWriter.write(ch,0,len);
          }*/
          //将缓冲数组转换成字符串，写入
          char[] ch = new char[5];
          int len;
          while ((len=fileReader.read(ch))!=-1){
              fileWriter.write(new String(ch,0,len));
          }
          fileWriter.close();
          fileReader.close();
      }
  }
  ```


---

！不要用字符流操作非文本文件