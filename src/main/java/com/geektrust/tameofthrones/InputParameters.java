package com.geektrust.tameofthrones;

import com.geektrust.tameofthrones.entity.Kingdom;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class InputParameters {
    public static final String SPACE = " ";

    private final String rawMessageLine;
    private final Kingdom kingdom;
    private final String encryptedMessage;
    private final String decryptedMessages;

    public InputParameters(String rawMessageLine, Kingdom kingdom, String encryptedMessage) {
        this.rawMessageLine = rawMessageLine;
        this.kingdom = kingdom;
        this.encryptedMessage = encryptedMessage;
        this.decryptedMessages = kingdom.getEmblem().decrypt(encryptedMessage);
    }

    public static InputParameters parse(String unparsedEncryptedMessage) {
        Objects.requireNonNull(unparsedEncryptedMessage, "Message is null.");
        List<String> messageParts = Arrays.stream(unparsedEncryptedMessage.split(SPACE))
                .filter(Objects::nonNull)
                .filter(val -> val.trim().length() > 0)
                .collect(Collectors.toList());
        return new InputParameters(unparsedEncryptedMessage,
                Kingdom.valueOf(messageParts.get(0)),
                String.join("", messageParts.subList(1, messageParts.size()))
        );
    }

    public String getRawMessageLine() {
        return rawMessageLine;
    }

    public Kingdom getKingdom() {
        return kingdom;
    }

    public String getEncryptedMessage() {
        return encryptedMessage;
    }

    public String getDecryptedMessages() {
        return decryptedMessages;
    }
}
