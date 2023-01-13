package org.visualnut.numbers.tests;

import org.junit.Test;
import org.visualnut.numbers.Main;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author geraldobarrosjr
 */
public class MainTest {
    private final int MAX_NUMBER = 100;
    @Test
    public void testMainFunction() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[] {String.valueOf(MAX_NUMBER)});
        String expected = buildExpectedOutput(MAX_NUMBER);
        assertEquals(expected, outContent.toString());
    }

    private String buildExpectedOutput(int maxNumber) {
        StringBuilder expected = new StringBuilder();
        for (int i = 1; i <= maxNumber; i++) {
            if (i % 15 == 0) {
                expected.append("Visual Nuts\n");
            }else if (i % 3 == 0) {
                expected.append("Visual\n");
            } else if (i % 5 == 0) {
                expected.append("Nuts\n");
            } else {
                expected.append(i + "\n");
            }
        }
        return expected.toString();
    }
}
