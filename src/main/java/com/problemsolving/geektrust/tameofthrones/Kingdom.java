package com.problemsolving.geektrust.tameofthrones;

public enum Kingdom {
    SPACE(Emblem.GORILLA),
    LAND (Emblem.PANDA),
    WATER(Emblem.OCTOPUS),
    ICE  (Emblem.MAMMOTH),
    AIR  (Emblem.OWL),
    FIRE (Emblem.DRAGON);

    private final Emblem emblem;

    Kingdom(Emblem emblem) {
        this.emblem = emblem;
    }

    public Emblem getEmblem() {
        return emblem;
    }

    public enum Emblem {
        GORILLA, PANDA, OCTOPUS, MAMMOTH, OWL, DRAGON;
    }
}
