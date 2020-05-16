package com.jdkDemo.javaIo;

import java.io.*;

/**
 * 文件操作
 *
 * @author xiaoerque
 * @create 2020-05-16-11:25
 */
public class TestFileOperate {
    public static void main(String[] args) throws IOException{
        //fileCreateTest();
        //fileDelTest();
        //fileWriteSomeThing();
        fileReadSomeThing();
    }

    //指定目录创建文件
    private static void fileCreateTest() throws IOException {
        File file = null;
        File dir = new File("E:/workSpace/del/20-5-16");
        file = File.createTempFile("JaveTemp",".txt",dir);
        System.out.println(file.getPath());
    }
    //指定目录删除文件
    private static void fileDelTest() throws IOException {
        File file = null;
        File dir = new File("E:/workSpace/del/20-5-16");
        file = File.createTempFile("delFile",".txt",dir);
        System.out.println("先创建的文件为:"+file.getPath());
        System.out.println("开始删除!");
        if(file.delete()){
            System.out.println("文件删除成功!");
        }else {
            System.out.println("文件删除失败!");
        }
        System.out.println("再输入一下路径:"+file.getPath());
    }
    //往文件里写入东西
    private static void fileWriteSomeThing() throws IOException {
        BufferedWriter out = new BufferedWriter(new  FileWriter
                ("E:/workSpace/del/20-5-16/JaveTemp3753388591540818465.txt"));
        out.write("FileWriter是OutputStreamWriter的子类");
        out.write("OutputStreamWriter是Writer的子类");
        out.close();
    }
    //从文件里读出一些东西
    private static void fileReadSomeThing() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("E:/workSpace/del/20-5-16/JaveTemp3753388591540818465.txt"));
        String str;
        while ((str = reader.readLine()) != null){
            System.out.println(str);
        }
    }
}
