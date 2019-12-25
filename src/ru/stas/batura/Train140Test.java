package ru.stas.batura;

import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class Train140Test {

    @Before
    void prepare() {
//        Train140.countingValleys(8,"UDDDUDUU");
    }

    @org.junit.jupiter.api.Test
    void countingValleys1() {
        assertEquals(1,Train140.countingValleys(8,"UDDDUDUU"));
    }

    @org.junit.jupiter.api.Test
    void countingValleys2() {
        assertEquals(2,Train140.countingValleys(12,"DDUUDDUDUUUD"));
    }

    @org.junit.jupiter.api.Test
    void countingValleys3() {
        assertEquals(1,Train140.countingValleys(2,"DU"));
    }

    @org.junit.jupiter.api.Test
    void countingValleys4() {
        assertEquals(3,Train140.countingValleys(6,"DUDUDU"));
    }

    @org.junit.jupiter.api.Test
    void countingValleys5() {
        assertEquals(0,Train140.countingValleys(2,"UD"));
    }

    @org.junit.jupiter.api.Test
    void countingValleys6() {
        assertEquals(0,Train140.countingValleys(0,"DDDDDDDDDDDDDDDDD"));
    }

    @org.junit.jupiter.api.Test
    void countingValleys7() {
        assertEquals(0,Train140.countingValleys(0,"UUUUUUUUUUUUUUUUU"));
    }


}