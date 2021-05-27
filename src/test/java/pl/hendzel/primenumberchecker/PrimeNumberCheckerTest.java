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

}