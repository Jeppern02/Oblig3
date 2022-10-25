import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class isLeapYearTest {

    @Test
    public void yearDevisibleWith4AndNot100IsLeapYear() {
        assertTrue(Year.isLeapYear(2016));
        assertTrue(Year.isLeapYear(1996));
        assertTrue(Year.isLeapYear(2024));
    }

    @Test
    public void yearDevisibleWith400IsLeapYear() {
        assertTrue(Year.isLeapYear(3200));
        assertTrue(Year.isLeapYear(1600));
        assertTrue(Year.isLeapYear(2000));
    }

    @Test
    public void yearNotDevisibleWith4() {
        assertFalse(Year.isLeapYear(1243));
        assertFalse(Year.isLeapYear(1998));
        assertFalse(Year.isLeapYear(2015));
    }

    @Test
    public void yearIsDivisibleWith100AndNotWith400() {
        assertFalse(Year.isLeapYear(200));
        assertFalse(Year.isLeapYear(900));
        assertFalse(Year.isLeapYear(1700));
    }



    @Test
    public void isLeapYear() {
        assertTrue(Year.isLeapYear(2020));
    }


}
