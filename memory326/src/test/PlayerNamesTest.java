package test;

import console.PlayerNames;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerNamesTest {

    @Test
    public void test() {

        String[] array = PlayerNames.playerName(new ByteArrayInputStream((
                "2" + System.lineSeparator() + "Dennis" + System.lineSeparator() + "Loic" + System.lineSeparator()
        ).getBytes(StandardCharsets.UTF_8)));

        assertEquals("Dennis", array[0]);
        assertEquals("Loic", array[1]);
    }
}