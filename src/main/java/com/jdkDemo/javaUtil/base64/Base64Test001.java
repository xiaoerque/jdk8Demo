package com.jdkDemo.javaUtil.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * 测试base64
 *
 * @author xiaoerque
 * @create 2020-05-09-15:51
 */
public class Base64Test001 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //一:基本编码
        testBase64();
        System.out.println("--------------------------------------");
        //二:URL编码
        testUrlBase64();
        System.out.println("--------------------------------------");
        //三:MIME编码
        testMIMEBase64();
    }

    private static void testBase64() throws UnsupportedEncodingException {
        String encodeToString = Base64.getEncoder().encodeToString("java:HelloWord".getBytes());
        System.out.println("encodeToString:" + encodeToString);

        byte[] decode = Base64.getDecoder().decode(encodeToString);
        System.out.println("解码后的样子:" + decode);
        System.out.println("解码后字符串换成utf-8:" + new String(decode, "utf-8"));
    }

    private static void testUrlBase64() throws UnsupportedEncodingException {
        String urlEncodeToString = Base64.getUrlEncoder().encodeToString("java:HelloWord".getBytes());
        System.out.println("urlEncodeToString:" + urlEncodeToString);

        byte[] urlDecode = Base64.getUrlDecoder().decode(urlEncodeToString);
        System.out.println("url解码后的样子:" + urlDecode);
        System.out.println("解码后字符串换成utf-8:" + new String(urlDecode, "utf-8"));
    }

    private static void testMIMEBase64() throws UnsupportedEncodingException {
        String mimeEncodeToString = Base64.getMimeEncoder().encodeToString("java:HelloWord".getBytes());
        System.out.println("mimeEncodeToString:" + mimeEncodeToString);

        byte[] mimeDecode = Base64.getMimeDecoder().decode(mimeEncodeToString);
        System.out.println("mime解码后的样子:" + mimeDecode);
        System.out.println("解码后字符串换成utf-8:" + new String(mimeDecode, "utf-8"));
    }
}
