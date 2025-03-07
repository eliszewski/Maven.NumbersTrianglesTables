package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

public class NumberUtilitiesTest {
    @Test
    public void testGetRange1A() {
        // : Given
        String expected = "012345678910"; //changed test to expect 012345678910
        int stop = 11;

        // : When
        String actual = NumberUtilities.getRange(stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange2A() {
        // : Given
        String expected = "01234";
        int stop = 5;

        // : When
        String actual = NumberUtilities.getRange(stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetRange3A() {
        // : Given
        String expected = "012345678910111213141516171819";
        int stop = 20;

        // : When
        String actual = NumberUtilities.getRange(stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }












    @Test
    public void testGetRange1B() {
        // : Given
        String expected = "5678910111213141516171819";
        int start = 5;
        int stop = 20;

        // : When
        String actual = NumberUtilities.getRange(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange2B() {
        // : Given
        String expected = "101112131415161718192021222324";
        int start = 10;
        int stop = 25;

        // : When
        String actual = NumberUtilities.getRange(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange3B() {
        // : Given
        String expected = "100101102103104105106107108109"; // changed expected strings from 100101103104105106107108109 to 100101102103104105106107108109
        int start = 100;
        int stop = 110;

        // : When
        String actual = NumberUtilities.getRange(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }













    @Test
    public void testGetRange1C() { //passed
        // : Given
        String expected = "51015";
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = NumberUtilities.getRange(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange2C() {
        // : Given
        String expected = "012345678910111213141516171819";
        int start = 0;
        int stop = 20;
        int step = 1;

        // : When
        String actual = NumberUtilities.getRange(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetRange3C() {
        // : Given
        String expected = "0246810";
        int start = 0;
        int stop = 11;
        int step = 2;

        // : When
        String actual = NumberUtilities.getRange(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }














    @Test
    public void testGetEvenNumbers() {
        // : Given
        String expected = "681012141618"; //changed expected string to even numbers
        int start = 5;
        int stop = 20;

        // : When
        String actual = NumberUtilities.getEvenNumbers(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOddNumbers() {
        // : Given
        String expected = "5791113151719"; //changed expected string to odd numbers
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = NumberUtilities.getOddNumbers(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testGetSquareNumbers() {
        // : Given
        String expected = "25100225";
        int start = 5;
        int stop = 20;
        int step = 5;

        // : When
        String actual = NumberUtilities.getSquareNumbers(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetExponentiationNumbers() {
        // : Given
        String expected = "25100225";
        int start = 5;
        int stop = 20;
        int step = 5;
        int exponent = 2;

        // : When
        String actual = NumberUtilities.getExponentiations(start, stop, step, exponent);

        Assert.assertEquals(expected, actual);
    }
}
