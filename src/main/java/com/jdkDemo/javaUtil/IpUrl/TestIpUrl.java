package com.jdkDemo.javaUtil.IpUrl;

import java.io.IOException;
import java.net.*;

/**
 * 对IP的测试
 *
 * @author xiaoerque
 * @create 2020-05-24-10:05
 */
public class TestIpUrl {
    public static void main(String[] args) throws Exception {

        /**
         *这里面的方法每次只能执行一个哦
         * */

        //获取百度的ip
        //testUrlToIp("www.baidu.com");
        //
        //testPort(args);
        //getLocalHostAndAddress();
        getRemoteFileSize();
    }

    //根据网站地址获取IP地址
    private static void testUrlToIp(String url) throws UnknownHostException {
        InetAddress ip = InetAddress.getByName(url);
        System.out.println(ip.getHostName() + " = " + ip.getHostAddress());
        System.exit(0);
    }

    //查看端口是否被占用(报错  不知道为何  )
    private static void testPort(String... args) {
        Socket Skt;
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 0; i < 137; i++) {
            if(i>=135){
                try {
                    System.out.println("查看端口:" + i);
                    Skt = new Socket(host, i);
                    System.out.println("端口:" + i + " 已被使用!");
                } catch (UnknownHostException e) {
                    System.out.println("Exception occured" + e);
                    break;
                } catch (IOException e) {
                }
            }
        }
    }

    //获取本机的ip地址和主机名称
    private static void getLocalHostAndAddress() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("主机名称:" + inetAddress.getHostName());
        System.out.println("主机地址:" + inetAddress.getHostAddress());
    }
    //获得远程文件大小
    private static void getRemoteFileSize() throws Exception  {
        int size;

            URL url = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590378567862&di=c6dd1fb6123231174bf2a1429d1ad0da&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg");
            URLConnection connection = url.openConnection();
            size = connection.getContentLength();
            if (size < 0)
                System.out.println("无法获取文件大小。");
            else
                System.out.println("文件大小为：" +
                        + size + " bytes");

            connection.getInputStream().close();



    }
}
