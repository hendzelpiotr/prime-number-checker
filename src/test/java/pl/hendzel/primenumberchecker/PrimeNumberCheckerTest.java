package pl.hendzel.primenumberchecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeNumberCheckerTest {

    @Test
    void isPrimeNumber_shouldThrowExceptionWhenInputIsNotANumber() {
        //given
        var input = "word";

        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> PrimeNumberChecker.isPrimeNumber(input));
    }

    @Test
    void isPrimeNumber_shouldThrowExceptionWhenInputIsNegativeNumber() {
        //given
        var input = "-1";

        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> PrimeNumberChecker.isPrimeNumber(input));
    }

    @Test
    void isPrimeNumber_shouldThrowExceptionWhenInputIsFloatingPointNumber() {
        //given
        var input = "1.23";

        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> PrimeNumberChecker.isPrimeNumber(input));
    }

}