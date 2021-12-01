# Flie类

- 创建File类的对象

  ```java 
  File file = new File("路径");
  ```

- File类常用方法

  ```java
  file.canRead();//文件是否可读
  file.canWrite();//文件是否可写
  file.getName();//获取文件名字
  file.getParent();//获取文件上级目录
  file.isDirectory();//是否为目录
  file.isFile();//是否为文件
  file.isHidden();//是否隐藏
  file.length();//文件大小
  file.exists();//是否存在
  file.createNewFile();//创建文件
  file.getAbsolutePath();//获取绝对路径
  file.getPath();//获取相对路径
  file.toString();
  file.mkdirs();//创建多层目录
  file.mkdir();//创建单层目录
  file.delete();//删除空目录
  //查看文件文件夹下的目录/文件名字
  String[] list = file.list();
  for(String s:list){
      System.out.println(s);
  }
  //--------------------------
  File[] files = file.listFiles();
  for(File f:files){
      System.out.println(fil.getName()+","+f.getAbsolutePath())
  }
      
  ```

  



