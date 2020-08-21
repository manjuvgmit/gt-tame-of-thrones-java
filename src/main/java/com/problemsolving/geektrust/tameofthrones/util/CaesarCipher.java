package com.problemsolving.geektrust.tameofthrones.util;

import com.problemsolving.geektrust.tameofthrones.model.Emblem;

public final class CaesarCipher {

    public static final int LEFT_BOUND = 'A';
    public static final int RIGHT_BOUND = 'Z';

    public static String encrypt(String input, int cipher) {
        byte[] bytes = input.getBytes();
        for (int index = 0; index < input.getBytes().length; index++) {
            bytes[index] = Integer.valueOf(Byte.valueOf(bytes[index]).intValue() + cipher).byteValue();
        }
        return new String(bytes);
    }

    public static String decrypt(String input, int cipher) {
        char[] chars = input.toCharArray();
        for (int index = 0; index < input.getBytes().length; index++) {
            int decryptedVal = chars[index] - cipher;
            if (decryptedVal < LEFT_BOUND) {
                decryptedVal = RIGHT_BOUND - (LEFT_BOUND - decryptedVal - 1);
            }
            chars[index] = (char)decryptedVal;
        }
        return new String(chars);
    }

    public static int getCipher(Emblem emblem) {
        return emblem.name().length();
    }
}
