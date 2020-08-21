package com.problemsolving.geektrust.tameofthrones.model;

import static com.problemsolving.geektrust.tameofthrones.model.Emblem.*;

public enum Kingdom {
    SPACE("SPACE", GORILLA),
    LAND ("LAND", PANDA),
    WATER("WATER", OCTOPUS),
    ICE  ("ICE", MAMMOTH),
    AIR  ("AIR", OWL),
    FIRE ("FIRE", DRAGON);

    private final String name;
    private final Emblem emblem;

    Kingdom(String name, Emblem emblem) {
        this.name = name;
        this.emblem = emblem;
    }

    public String getName() {
        return name;
    }

    public Emblem getEmblem() {
        return emblem;
    }
}
