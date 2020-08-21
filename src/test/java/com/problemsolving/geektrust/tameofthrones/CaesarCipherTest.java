package com.problemsolving.geektrust.tameofthrones;

import com.problemsolving.geektrust.tameofthrones.model.Kingdom;
import org.junit.Test;

import static com.problemsolving.geektrust.tameofthrones.util.CaesarCipher.*;
import static org.junit.Assert.assertEquals;

public class CaesarCipherTest {
    @Test
    public void testDecrypt() {
        assertEquals("Should match", "Y", decrypt("A", 2));
        assertEquals("Should match", "U", decrypt("Z", 5));
    }

    @Test
    public void testDecryptForWords() {
        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        assertEquals("Should match", "OLWL", decrypt("ROZO", getCipher(Kingdom.AIR.getEmblem())));
        assertEquals("Should match", "AVDERENJJAVHVP", decrypt("FAIJWJSOOFAMAU", getCipher(Kingdom.LAND.getEmblem())));
        assertEquals("Should match", "LMALMLMOLTLHL", decrypt("STHSTSTVSASOS", getCipher(Kingdom.ICE.getEmblem())));
    }

}
