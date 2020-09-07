package com.geektrust.tameofthrones;

import com.geektrust.tameofthrones.entity.Kingdom;
import com.geektrust.tameofthrones.utils.CaesarCipher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarCipherTest {
    @Test
    public void testDecrypt() {
        Assert.assertEquals("Should match", "Y", CaesarCipher.decrypt("A", 2));
        Assert.assertEquals("Should match", "U", CaesarCipher.decrypt("Z", 5));
    }

    @Test
    public void testDecryptForWords() {
        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        Assert.assertEquals("Should match", "OLWL", CaesarCipher.decrypt("ROZO", CaesarCipher.getCipher(Kingdom.AIR.getEmblem())));
        Assert.assertEquals("Should match", "AVDERENJJAVHVP", CaesarCipher.decrypt("FAIJWJSOOFAMAU", CaesarCipher.getCipher(Kingdom.LAND.getEmblem())));
        Assert.assertEquals("Should match", "LMALMLMOLTLHL", CaesarCipher.decrypt("STHSTSTVSASOS", CaesarCipher.getCipher(Kingdom.ICE.getEmblem())));
        Assert.assertEquals("Should match", "PTMXKsHVMHsOCTOPUSsINL", CaesarCipher.decrypt("WATER OCTO VJAVWBZ PUS", CaesarCipher.getCipher(Kingdom.WATER.getEmblem())));
        Assert.assertEquals("Should match", "DRAIIGONII", CaesarCipher.decrypt("JXGOOMUTOO", CaesarCipher.getCipher(Kingdom.FIRE.getEmblem())));
    }

}
