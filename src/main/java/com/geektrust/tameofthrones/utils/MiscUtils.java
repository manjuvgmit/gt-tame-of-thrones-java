package com.geektrust.tameofthrones.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public final class MiscUtils {
    private MiscUtils() {}

    public static List<String> extractMessagesFromFile(String filePathContainingKingdomsMessages) throws IOException {
        return Files.readAllLines(Paths.get(filePathContainingKingdomsMessages));
    }
}
