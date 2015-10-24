package com.bob;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;

import static com.bob.Blowfish.keyGenerator;
import static com.google.common.io.BaseEncoding.base64;

public class Password {
    Key key=null;

    public String encrpytion(String password) {
        String out = "";
        try {
            key=initKey();
            System.out.println("Key : " + base64().encode(key.getEncoded()));
            String src = password;
            byte[] target = Blowfish.encrypt(key, src);
            out = base64().encode(target);
            System.out.println("encrypted： " + out);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }

    public String decryption(String password) {
        String out = "";
        try {
            key=initKey();
            System.out.println("Key : " + base64().encode(key.getEncoded()));
            String src = password;
            byte[] target = base64().decode(password);
            out = new String(Blowfish.decrypt(key, target));
            System.out.println("original： " + out);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }

    private Key initKey() {
        try {
            if(key==null)
                key = keyGenerator();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return key;
    }
}