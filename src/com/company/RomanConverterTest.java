package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class romanConverterTest {

    @Test
    public void whenNumberIsConvertedItReturnsValue(){
        RomanConverter romanConverter=new RomanConverterImpl2();
        assertEquals("I",romanConverter.convert(1));
        assertEquals("II",romanConverter.convert(2));
        assertEquals("III",romanConverter.convert(3));
        assertEquals("IV",romanConverter.convert(4));
        assertEquals("V",romanConverter.convert(5));
        assertEquals("VI",romanConverter.convert(6));
        assertEquals("VII",romanConverter.convert(7));
        assertEquals("VIII",romanConverter.convert(8));
        assertEquals("IX",romanConverter.convert(9));
        assertEquals("X",romanConverter.convert(10));


    }

    @Test
    public void whenRomanIsConvertedToNumberItReturnsValue(){
        RomanConverter romanConverter=new RomanConverterImpl2();
        assertEquals(romanConverter.convert("I"),1);
        assertEquals(romanConverter.convert("II"),2);
        assertEquals(romanConverter.convert("III"),3);
        assertEquals(romanConverter.convert("IV"),4);
        assertEquals(romanConverter.convert("V"),5);
        assertEquals(romanConverter.convert("VI"),6);
        assertEquals(romanConverter.convert("VII"),7);
        assertEquals(romanConverter.convert("VIII"),8);
        assertEquals(romanConverter.convert("IX"),9);
        assertEquals(romanConverter.convert("X"),10);
    }
}