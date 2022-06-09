package org.example.qajavamvnPackagesAndCycles.sqr;

import org.example.qajavamvnPackagesAndCycles.sqr.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.testng.annotations.Test;



public class SQRServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void shouldExact(int expected, int min, int max){
        SQRService service = new SQRService();


        int actual = service.calcSqrt(min,max);

        Assertions.assertEquals(expected, actual);




    }
}
