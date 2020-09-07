package com.geektrust.tameofthrones.entity;

import com.geektrust.tameofthrones.utils.CaesarCipher;

public enum Emblem {
    GORILLA, PANDA, OCTOPUS, MAMMOTH, OWL, DRAGON;

    public String encrypt(String plainMessage) {
        return CaesarCipher.encrypt(plainMessage, this.name().length());
    }

    public String decrypt(String encryptedMessage) {
        return CaesarCipher.decrypt(encryptedMessage, this.name().length());
    }
}