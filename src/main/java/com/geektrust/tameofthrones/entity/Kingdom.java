package com.geektrust.tameofthrones.entity;

import static com.geektrust.tameofthrones.entity.Emblem.*;

public enum Kingdom {
    SPACE(GORILLA), LAND(PANDA), WATER(OCTOPUS), ICE(MAMMOTH), AIR(OWL), FIRE(DRAGON);

    private final Emblem emblem;

    Kingdom(Emblem emblem) {
        this.emblem = emblem;
    }

    public Emblem getEmblem() {
        return emblem;
    }
}
