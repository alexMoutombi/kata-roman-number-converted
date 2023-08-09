package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test
    @DisplayName("converts 401")
    void givenArabicNumber401_whenConverted_theReturn_CDI() {
        App app = new App(401);
        Assertions.assertEquals("CDI", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 1")
    void givenArabicNumber1_whenConverted_theReturn_I() {
        App app = new App(1);
        Assertions.assertEquals("I", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 2")
    void givenArabicNumber2_whenConverted_theReturn_II() {
        App app = new App(2);
        Assertions.assertEquals("II", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 3")
    void givenArabicNumber3_whenConverted_theReturn_III() {
        App app = new App(3);
        Assertions.assertEquals("III", app.getRomanNumber());
    }


    @Test
    @DisplayName("converts 4")
    void givenArabicNumber4_whenConverted_theReturn_IV() {
        App app = new App(4);
        Assertions.assertEquals("IV", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 5")
    void givenArabicNumber5_whenConverted_theReturn_V() {
        App app = new App(5);
        Assertions.assertEquals("V", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 9")
    void givenArabicNumber9_whenConverted_theReturn_IX() {
        App app = new App(9);
        Assertions.assertEquals("IX", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 16")
    void givenArabicNumber16_whenConverted_theReturn_XVI() {
        App app = new App(16);
        Assertions.assertEquals("XVI", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 48")
    void givenArabicNumber48_whenConverted_theReturn_XLVIII() {
        App app = new App(48);
        Assertions.assertEquals("XLVIII", app.getRomanNumber());
    }


    @Test
    @DisplayName("converts 49")
    void givenArabicNumber49_whenConverted_theReturn_XLIX() {
        App app = new App(49);
        Assertions.assertEquals("XLIX", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 93")
    void givenArabicNumber93_whenConverted_theReturn_XCIII() {
        App app = new App(93);
        Assertions.assertEquals("XCIII", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 141")
    void givenArabicNumber141_whenConverted_theReturn_CXLI() {
        App app = new App(141);
        Assertions.assertEquals("CXLI", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 402")
    void givenArabicNumber402_whenConverted_theReturn_CDII() {
        App app = new App(402);
        Assertions.assertEquals("CDII", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 666")
    void givenArabicNumber666_whenConverted_theReturn_DCLXVI() {
        App app = new App(666);
        Assertions.assertEquals("DCLXVI", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 1024")
    void givenArabicNumber1024_whenConverted_theReturn_MXXIV() {
        App app = new App(1024);
        Assertions.assertEquals("MXXIV", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 3000")
    void givenArabicNumber3000_whenConverted_theReturn_MMM() {
        App app = new App(3000);
        Assertions.assertEquals("MMM", app.getRomanNumber());
    }

    @Test
    @DisplayName("converts 3999")
    void givenArabicNumber3999_whenConverted_theReturn_MMMCMXCIX() {
        App app = new App(3999);
        Assertions.assertEquals("MMMCMXCIX", app.getRomanNumber());
    }

}
