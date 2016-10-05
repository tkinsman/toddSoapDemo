package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by toddkinsman on 10/5/16.
 */
public class TemperatureConversionsTest {

    @Test
    public void getTemperatureConversionsSoap12CtoF() throws Exception {

        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celciusToFahreinheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celsius to fahreinheit failed", celciusToFahreinheitResult, BigDecimal.valueOf(32));
    }

    @Test
    public void getTemperatureConversionsSoap12FtoC() throws Exception {

        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahreinheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));
        assertEquals("The fahreinheit to celsius failed", fahreinheitToCelsiusResult, BigDecimal.valueOf(0));
    }

}