package com.bob;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import static com.google.common.io.BaseEncoding.base64;

/**
 * Created by root on 10/24/15.
 */
public class Blowfish {

    /**
     * @return
     * @throws Exception
     */
    public static Key keyGenerator() throws Exception {
        //        KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
        //        keyGenerator.init(128);
        //        return keyGenerator.generateKey();
        byte kbtye[] = "ildskey".getBytes();
        final String blowfish = "Blowfish";
        SecretKeySpec key = new SecretKeySpec(kbtye, blowfish);
        return key;
    }

    /**
     * 加密
     *
     * @param key
     * @param text
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(Key key,String text) throws Exception  {
        Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(text.getBytes());
    }

    /**
     * 解密
     *
     * @param key
     * @param text
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(Key key,byte[] bt) throws Exception  {
        Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key);
        return cipher.doFinal(bt);
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception  {

    }

}