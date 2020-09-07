/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.geektrust.tameofthrones;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static com.google.common.collect.ImmutableList.of;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppTest {
    public static final String NONE = "NONE";
    App classUnderTest = new App();

    @Test
    public void testInputFromFile() throws IOException {
        runTestFromFile("SPACE AIR LAND ICE", "docs/input-01.txt");
    }

    @Test
    public void test01() throws IOException {
        runTestFromCommands("SPACE AIR LAND ICE", of("AIR ROZO", "LAND FAIJWJSOOFAMAU", "ICE STHSTSTVSASOS"));
    }

    @Test
    public void test02() throws IOException {
        runTestFromCommands(NONE, of("AIR RMZM", "LAND FAIJWJSOOFAMAU", "ICE STHSTSTVSASOS"));
    }

    @Test
    public void test03() throws IOException {
        runTestFromCommands(NONE, of("AIR RMZM", "LAND FAJJWJSOOFAMAU", "ICE STHSTSTVSBSOS"));
    }

    @Test
    public void test04() throws IOException {
        runTestFromCommands(NONE, of("AIR ROZO", "AIR ROZO", "AIR ROZO"));
    }

    @Test
    public void test05() throws IOException {
        runTestFromCommands("SPACE LAND ICE FIRE", of("AIR OWL", "LAND FAIJWJSOOFAMAU", "ICE STHSTSTVSASOS", "FIRE JXGOOMUTOO"));
    }

    @Test
    public void test06() throws IOException {
        runTestFromCommands("SPACE FIRE AIR WATER", of("LAND PANDAUFSI", "ICE MAMMOTH THVAO", "FIRE DRAGON JXGMUT", "AIR ZORRO", "WATER OCTO VJAVWBZ PUS"));
    }

    private void runTestFromCommands(String expected, List<String> args) throws IOException {
        assertExpectation(expected, classUnderTest.checkForAlliances(args));
    }

    private void runTestFromFile(String expected, String args) throws IOException {
        assertExpectation(expected, classUnderTest.checkForAlliancesUsingMessagesFromFile(args));
    }

    private void assertExpectation(String expected, String generated) {
        assertNotNull("Result should not not be null.", generated);
        assertEquals("Result should match the expected string.", expected, generated);
    }
}