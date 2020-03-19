package com.code.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <p>
 * MD5加密工具类
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
public class MD5 {

    public static String md5(String string) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(string.getBytes("utf-8"));
        byte b[] = md.digest();

        int i;
        StringBuffer buf = new StringBuffer("");

        for (int offset = 0; offset < b.length; offset++) {
            i = b[offset];
            if (i < 0) {
                i += 256;
            }
            if (i < 16) {
                buf.append("0");
            }
            buf.append(Integer.toHexString(i));
        }
        return buf.toString();
    }

    public static String upper(String str) throws Exception {
        return md5(str).toUpperCase();
    }


    public static void main(String[] args) throws Exception {
        System.out.println(md5("123456"));
    }


}
