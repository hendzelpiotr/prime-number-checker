package pl.hendzel.primenumberchecker;

import org.apache.commons.lang3.math.NumberUtils;

public final class PrimeNumberChecker {

    private PrimeNumberChecker() {
    }

    public static Boolean isPrimeNumber(String number) {
        if (isNotNumber(number)) {
            throw new IllegalArgumentException("Input is not a number");
        } else if (isNegativeNumber(number)) {
            throw new IllegalArgumentException("Input is a negative number");
        } else if (isFloatingPointNumber(number)) {
            throw new IllegalArgumentException("Input is a floating point number");
        }
        return null;
    }

    private static boolean isNotNumber(String number) {
        return !NumberUtils.isParsable(number);
    }

    private static boolean isNegativeNumber(String number) {
        return Double.parseDouble(number) < 0;
    }

    private static boolean isFloatingPointNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(number);
            } catch (NumberFormatException e2) {
                return false;
            }
            return true;
        }
        return false;
    }

}
