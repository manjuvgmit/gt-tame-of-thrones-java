package com.problemsolving.geektrust.tameofthrones;

import static com.problemsolving.geektrust.tameofthrones.Kingdom.Emblem.*;

public enum Kingdom {
    SPACE(GORILLA), LAND(PANDA), WATER(OCTOPUS), ICE(MAMMOTH), AIR(OWL), FIRE(DRAGON);

    private final Emblem emblem;

    Kingdom(Emblem emblem) {
        this.emblem = emblem;
    }

    public Emblem getEmblem() {
        return emblem;
    }

    public enum Emblem {
        GORILLA, PANDA, OCTOPUS, MAMMOTH, OWL, DRAGON;

        public String encrypt(String plainMessage) {
            return CaesarCipher.encrypt(plainMessage, this.name().length());
        }

        public String decrypt(String encryptedMessage) {
            return CaesarCipher.decrypt(encryptedMessage, this.name().length());
        }
    }
}
