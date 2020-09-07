package com.geektrust.tameofthrones;

import com.geektrust.tameofthrones.entity.Kingdom;
import com.google.common.primitives.Bytes;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class AllianceFinder {
    public static final String NONE = "NONE";
    public static final String SPACE = " ";

    public String checkForAlliances(List<String> messagesFromKingdoms) {
        // Stop processing if messages are less than minimum support needed
        if (messagesFromKingdoms.size() < 3) {
            return NONE;
        }
        // Find allies and format the result
        return formatResult(findAlliesBasedOnMessage(messagesFromKingdoms));
    }

    /**
     * Returns result in the required format i.e "SPACE KINGDOM1 KINGDOM2 KINGDOM3" or "NONE"
     * @param allies kingdoms are messages which are in support
     * @return string formatted result as mentioned above
     */
    private String formatResult(Set<Kingdom> allies) {
        return allies.size() > 2
                ? Kingdom.SPACE.name() + SPACE + allies.stream().map(Kingdom::name).distinct().collect(Collectors.joining(" "))
                : NONE;
    }

    /**
     * Parses, decrypts, checks and returns only those kingdoms messages in support
     * @param messagesFromKingdoms messages from all the kingdoms
     * @return messages from kingdoms are which are in support
     */
    private Set<Kingdom> findAlliesBasedOnMessage(List<String> messagesFromKingdoms) {
        return messagesFromKingdoms.stream()
                .map(InputParameters::parse)
                .filter(this::checkIfKingdomIsInSupport)
                .map(InputParameters::getKingdom)
                .collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Checks decrypted message if emblem chars are present.
     * This does it by taking chars of emblem including multiple occurrence into consideration.
     * @param parameters field containing all the input params as well as decrypted message
     * @return boolean true if message containing emblem chars otherwise false
     */
    private boolean checkIfKingdomIsInSupport(InputParameters parameters) {
        Map<String, Long> emblemChars = Bytes.asList(parameters.getKingdom().getEmblem().name().getBytes()).stream()
                .map(Object::toString).collect(groupingBy(identity(), counting()));
        Map<String, Long> msgChars = Bytes.asList(parameters.getDecryptedMessages().getBytes()).stream()
                .map(Object::toString).collect(groupingBy(identity(), counting()));
        return emblemChars.entrySet().stream()
                .filter(entry -> msgChars.containsKey(entry.getKey()))
                .filter(entry -> msgChars.get(entry.getKey()) >= entry.getValue())
                .count() == emblemChars.size();
    }
}
