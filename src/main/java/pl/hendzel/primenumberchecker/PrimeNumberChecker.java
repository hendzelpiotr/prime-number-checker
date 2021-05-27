package pl.hendzel.primenumberchecker;

import org.apache.commons.lang3.math.NumberUtils;

public final class PrimeNumberChecker {

    private PrimeNumberChecker() {
    }

    public static Boolean isPrimeNumber(String number) {
        if (!NumberUtils.isParsable(number)) {
            throw new IllegalArgumentException("Input is not a number");
        } else if (isNegativeNumber(number)) {
            throw new IllegalArgumentException("Input is a negative number");
        }
        return false;
    }

    private static boolean isNotNumber(String number) {
        try {
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    private static boolean isNegativeNumber(String number) {
        return Double.parseDouble(number) < 0;
    }

    private static boolean isFloatingPointNumber(String number) {
       try {
           Integer.parseInt(number);
       } catch (NumberFormatException e) {
           return true;
       }
       return false;
    }

}
