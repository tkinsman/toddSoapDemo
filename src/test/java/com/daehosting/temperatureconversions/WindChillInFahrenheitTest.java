package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by toddkinsman on 10/5/16.
 */
public class WindChillInFahrenheitTest {


    @Test
    public void getWindchillInF() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahreinheitWindChillResult = service.windChillInFahrenheit(BigDecimal.valueOf(40.0), BigDecimal.valueOf(15.0));

        // used api site documentation to validate output
        assertEquals("The windchill in fahreinheit failed", BigDecimal.valueOf(18.24599993), fahreinheitWindChillResult);

    }

    @Test
    public void getWindchillInC() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusWindChillResult = service.windChillInCelsius(BigDecimal.valueOf(15.0), BigDecimal.valueOf(15.0));

        // used the api site documetation to get valid output
        assertEquals("The windchill in celsius failed", BigDecimal.valueOf(5.6325), celsiusWindChillResult);

    }

}