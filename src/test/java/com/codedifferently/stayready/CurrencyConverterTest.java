package com.codedifferently.stayready;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyConverterTest {
    @Test
    public void dollarToEuroTest(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 47.47;

        //When 
        double actual = curconvert.dollarToEuro(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }

    @Test
    public void euroToDollarTest(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 53.7234042553195;

        //When 
        double actual = curconvert.euroToDollar(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);

    }

    @Test
    public void euroToBritishPoundTest(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 44.0531914893617;

        //When 
        double actual = curconvert.euroToBritishPound(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }

    @Test
    public void britishPoundToRupeeTest(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 4207.5122;

        //When 
        double actual = curconvert.britishPoundToRupee(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);

    }
    
    @Test
    public void rupeeToCandDollarTest(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 0.97570258;

        //When 
        double actual = curconvert.rupeeToCanDollar(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);

    }

    @Test
    public void candDollarToSingaDolllar(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 54.70833333;

        //When 
        double actual = curconvert.canDollarToSingaDollar(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);

    }

    @Test
    public void singaDollarToFranc(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 35.66783217;

        //When 
        double actual = curconvert.singaDollarToFranc(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);

    }

    @Test
    public void francToRinggitTest(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 223.5;

        //When 
        double actual = curconvert.francToRinggit(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);

    }

    @Test
    public void ringgitToYenTest(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 1308.706935;

        //When 
        double actual = curconvert.ringgitToYen(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);

    }

    @Test
    public void yenToYuan(){
        //Given
        CurrencyConverter curconvert = new CurrencyConverter();
        double expected = 3.01674724;

        //When 
        double actual = curconvert.yenToYuan(50.00);

        //Then
        Assert.assertEquals(expected, actual,0.001);

    }
}