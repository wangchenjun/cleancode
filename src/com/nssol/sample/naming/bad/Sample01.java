package com.nssol.sample.naming.bad;

public class Sample01 {

    // 避免使用数字系列命名 （a1, a2, a3 ... aN）
    public static void copyChars_bad(char[] a1, char[] a2) {
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }

    public static void copyChars_good(char[] src, char[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
    }

}
