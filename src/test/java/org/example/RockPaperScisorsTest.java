package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScisorsTest {
    @Test
    public void computerChooses_shouldBeAnInterger() {
        RockPaperScisors testGame = new RockPaperScisors();
        Object String = null;
        String computerChoise = testGame.computerChooses(String);
        String = null;
        assertEquals(computerChoise, testGame.computerChooses(String));

    }
}