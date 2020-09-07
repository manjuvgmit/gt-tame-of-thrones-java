package com.geektrust.tameofthrones.utils;

import com.geektrust.tameofthrones.entity.Emblem;

public final class CaesarCipher {

    public static String encrypt(String inputString, int cipher) {
        StringBuffer result = new StringBuffer();
        for (char character : inputString.toCharArray()) {
            result.append((char) (
                    Character.isUpperCase(character)
                            ? (((int) character + cipher - 65) % 26 + 65)
                            : (((int) character + cipher - 97) % 26 + 97))
            );
        }
        return result.toString();
    }

    public static String decrypt(String inputString, int cipher) {
        StringBuffer result = new StringBuffer();
        for (char character : inputString.toCharArray()) {
            result.append((char) (
                    Character.isUpperCase(character)
                            ? (((int) character - cipher + 65) % 26 + 65)
                            : (((int) character - cipher + 97) % 26 + 97))
            );
        }
        return result.toString();
    }

    public static int getCipher(Emblem emblem) {
        return emblem.name().length();
    }
}
