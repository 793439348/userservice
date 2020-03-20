package com.code.util;

import java.security.MessageDigest;

/**
 * <p>
 * MD5加密工具类
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-20
 */
public class MD5 {
    public static String md5(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update((str).getBytes("UTF-8"));
            byte b[] = md5.digest();

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String upper(String str) {
        return md5(str).toUpperCase();
    }
}
