package pl.hendzel.primenumberchecker;

import org.apache.commons.lang3.StringUtils;

public final class PrimeNumberChecker {

    private PrimeNumberChecker() {
    }

    public static Boolean isPrimeNumber(String number) {
        if (!StringUtils.isNumeric(number)) {
            throw new IllegalArgumentException("Input is not a number");
        }
        return null;
    }

}
